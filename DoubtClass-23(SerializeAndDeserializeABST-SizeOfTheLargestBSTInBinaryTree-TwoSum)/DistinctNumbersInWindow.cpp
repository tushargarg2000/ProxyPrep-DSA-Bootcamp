vector<int> distintNumbersInWindow(vector<int> &A, int k) {
    // add your logic here
	int n = A.size();
	vector<int> ans;
	map<int,int> ump;
	for(int i=0;i<k;i++) {
		ump[A[i]]++;
	}
	for(int i=k;i<n;i++) {
		ans.push_back(ump.size());
		if(ump[A[i-k]] == 1) {
			ump.erase(A[i-k]);
		}
		else {
			ump[A[i-k]]--;
		}
		ump[A[i]]++;
	}
	ans.push_back(ump.size());
	return ans;
}

// map[A[i]]++ -> map[A[i]] = map[A[i]] + 1;
// key -> A[i] 
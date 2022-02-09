vector<vector<int> > mergeIntervals(vector<vector<int> > &intervals) {
    // add your logic here
	sort(intervals.begin(),intervals.end());
	int index = 0;
	int n = intervals.size();
	for(int i=1;i<n;i++) {
		if(intervals[index][1] >= intervals[i][0]) {
			intervals[index][1] = max(intervals[index][1],intervals[i][1]);
		}
		else {
			index++;
			intervals[index][0] = intervals[i][0];
			intervals[index][1] = intervals[i][1];
		}
	}
	vector<vector<int>> ans;
	for(int i=0;i<=index;i++) {
		vector<int> v;
		v.push_back(intervals[i][0]);
		v.push_back(intervals[i][1]);
		ans.push_back(v);
	}
	return ans;
}
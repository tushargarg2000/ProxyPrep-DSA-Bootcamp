int calculateMedianOfMatrix(vector<vector<int> > &matrix) {
    // add your logic here
	int n = matrix.size();
	int m = matrix[0].size();
	int mine = INT_MAX;
	int maxe = INT_MIN;
	for(int i=0;i<n;i++) {
		mine = min(mine,matrix[i][0]);
		maxe = max(maxe,matrix[i][m-1]);
	}
	int target = (n*m + 1)/2;
		int ans = mine;
		while(mine <= maxe) {
			int mid = (mine + maxe)/2;
			int count = 0;
			for(int i=0;i<n;i++) {
				int index = upper_bound(matrix[i].begin(),matrix[i].end(),mid) - matrix[i].begin();
				count += index;
			}
			if(count < target) {
				mine = mid+1;
			}
			else {
				ans = mid;
				maxe = mid-1;
			}
		}
		return ans;
}
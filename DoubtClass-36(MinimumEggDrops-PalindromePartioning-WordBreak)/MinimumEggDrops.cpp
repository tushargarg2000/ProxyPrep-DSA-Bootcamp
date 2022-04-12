int minEggDrops(int k,int n, vector<vector<int>>& dp) {
	if(n <= 1 || k == 1) {
		return n;
	}
	if(dp[k][n] != -1) {
		return dp[k][n];
	}
	int ans = INT_MAX;
	for(int i=1;i<=n;i++) {
		int result = 1 + max(minEggDrops(k-1,i-1,dp), minEggDrops(k,n-i,dp));
		ans = min(ans, result);
	}
	return dp[k][n] = ans;
}
int minimumMoves(int k, int n) {
    // add your logic here
	vector<vector<int>> dp(k+1, vector<int>(n+1,-1));
	return minEggDrops(k,n,dp);
}
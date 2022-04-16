int solve(int i,int buy,int k,vector<int>& prices, vector<vector<vector<int>>>& dp) {
	if(i == prices.size() || k == 0) {
		return 0;
	}
	if(dp[i][buy][k] != -1) {
		return dp[i][buy][k];
	}
	if(buy == 1) {
		int buyStock = max(-prices[i] + solve(i+1,0,k,prices,dp), solve(i+1,1,k,prices,dp));
		return dp[i][buy][k] = buyStock;
	}
	else {
		int sellStock = max(prices[i] + solve(i+1,1,k-1,prices,dp), solve(i+1,0,k,prices,dp));
		return dp[i][buy][k] = sellStock;
	}
}
int maxProfit(vector<int> &prices, int k) {
    // add you logic here
	int n = prices.size();
	vector<vector<vector<int>>> dp(n+1, vector<vector<int>>(2, vector<int>(k+1,-1)));
	return solve(0,1,k,prices,dp);
}
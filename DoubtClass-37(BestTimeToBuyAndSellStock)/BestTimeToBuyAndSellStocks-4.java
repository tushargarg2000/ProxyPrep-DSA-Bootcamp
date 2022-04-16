class Solution {
	int dp[][][];
	int maxProfit(int[] prices, int k) {
	    // add you logic here
		int n = prices.length;
		dp = new int[n+1][2][k+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=1;j++) {
				for(int p=0;p<=k;p++) {
					dp[i][j][p] = -1;
				}
			}
		}
		return solve(0,1,k,prices);
	}
	int solve(int i,int buy,int k,int[] prices) {
		if(i == prices.length || k == 0) {
			return 0;
		}
		if(dp[i][buy][k] != -1) {
			return dp[i][buy][k];
		}
		int buyStock = Integer.MIN_VALUE;
        int sellStock = Integer.MIN_VALUE;
        if(buy == 1){
            buyStock = Math.max(-prices[i]+solve(i+1,0,k,prices), solve(i+1,1,k,prices));
        }
        else{
            sellStock = Math.max(prices[i]+solve(i+1,1,k-1,prices), solve(i+1,0,k,prices));
        }
        return dp[i][buy][k] = Math.max(buyStock,sellStock);
	}
}
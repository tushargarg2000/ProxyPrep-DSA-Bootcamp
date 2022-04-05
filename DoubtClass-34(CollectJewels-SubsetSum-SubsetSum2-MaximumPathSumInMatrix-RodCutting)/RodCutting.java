class Solution {
	int dp[];
	int maximumProfit(int n, int[] prices) {
	    // add you logic here
		dp = new int[n+1];
		Arrays.fill(dp, -1);
		return solve(n, prices);
	}
	int solve(int n,int[] prices) {
		if(n == 0) {
			return 0;
		}
		if(dp[n] != -1) {
			return dp[n];
		}
		dp[n] = 0;
		for(int i=1;i<=n;i++) {
			dp[n] = Math.max(dp[n], prices[i-1] + solve(n-i, prices));
		}
		return dp[n];
	}
}
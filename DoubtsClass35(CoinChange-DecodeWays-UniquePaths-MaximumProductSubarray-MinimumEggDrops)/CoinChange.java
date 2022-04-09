class Solution {
	int dp[][];
	int numberOfCombinations(int[] coins, int target) {
	    // add you logic here
		int n = coins.length;
		dp = new int[n+1][target+1];
		for(int i=0;i<=n;i++) {
			Arrays.fill(dp[i], -1);
		}
		return solve(coins,n,target);
	}
	int solve(int[] coins,int n,int target) {
		if(target < 0) {
			return 0;
		}
		if(n == 0) {
			if(target == 0) {
				return 1;
			}
			return 0;
		}
		if(dp[n][target] != -1) {
			return dp[n][target];
		}
		if(coins[n-1] > target) {
			return dp[n][target] = solve(coins,n-1,target);
		}
		return dp[n][target] = solve(coins,n-1,target) + solve(coins,n,target-coins[n-1]);
	}
}
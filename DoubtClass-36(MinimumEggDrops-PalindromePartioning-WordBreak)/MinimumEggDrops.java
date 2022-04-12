class Solution {
	int dp[][];
	int minEggDrops(int eggs, int floors) {
		if(floors <= 1 || eggs == 1) {
			return dp[eggs][floors] = floors;
		}
		if(dp[eggs][floors] != -1) {
			return dp[eggs][floors];
		}
		int minimum = Integer.MAX_VALUE, result;
		for(int i = 1; i <= floors; i++) {
			result = 1 + Math.max(minEggDrops(eggs - 1, i - 1), minEggDrops(eggs, floors - i));
			minimum = Math.min(result, minimum);
		}
		return dp[eggs][floors] = minimum;
	}
	int minimumMoves(int k, int n) {
		dp = new int[k + 1][n + 1];
		for(int i = 0; i <= k; i++) {
			Arrays.fill(dp[i], -1);
		}
	    return minEggDrops(k, n);
	}
}
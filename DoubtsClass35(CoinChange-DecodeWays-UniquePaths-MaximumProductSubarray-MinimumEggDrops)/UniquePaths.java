class Solution {
	int MOD = (int)1e9 + 7;
	int[][] dp;
	int uniquePathsUtil(int m, int n) {
	if(m == 1 || n == 1) {
		return 1;
	}
	if(dp[m][n] != -1) {
		return dp[m][n];
	}
	return dp[m][n] = (uniquePathsUtil(m - 1, n) + uniquePathsUtil(m, n - 1)) % MOD;
	}
	int uniquePaths(int m, int n) {
		dp = new int[m + 1][n + 1];
		for(int i = 0; i <= m; i++) {
			Arrays.fill(dp[i], -1);
		}
		return uniquePathsUtil(m, n);
	}
}
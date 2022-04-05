class Solution {
	int findMaxPath(int[][] M) {
	    // add you logic here
		int n = M.length;
		int m = M[0].length;
		int dp[][] = new int[n][m];
		for(int i=0;i<m;i++) {
			dp[0][i] = M[0][i];
		}
		for(int i=1;i<n;i++) {
			if(m == 1) {
				dp[i][0] = M[i][0] + dp[i-1][0];
				continue;
			}
			dp[i][0] = M[i][0] + Math.max(dp[i-1][0], dp[i-1][1]);
			for(int j=1;j<m-1;j++) {
				dp[i][j] = M[i][j] + Math.max(dp[i-1][j], Math.max(dp[i-1][j-1], dp[i-1][j+1]));
			}
			dp[i][m-1] = M[i][m-1] + Math.max(dp[i-1][m-1], dp[i-1][m-2]);
		}
		int ans = dp[n-1][0];
		for(int i=1;i<m;i++) {
			ans = Math.max(ans, dp[n-1][i]);
		}
		return ans;
	}
}
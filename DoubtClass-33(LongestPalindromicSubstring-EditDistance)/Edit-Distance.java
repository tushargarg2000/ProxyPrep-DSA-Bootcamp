class Solution {
	int dp[][];
	int solve(String s1,String s2,int i,int j,int n,int m) {
		if(i == n) {
			return (m-j);
		}
		if(j == m) {
			return (n-i);
		}
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		if(s1.charAt(i) == s2.charAt(j)) {
			return dp[i][j] = solve(s1,s2,i+1,j+1,n,m);
		}
		return dp[i][j] = 1 + Math.min(solve(s1,s2,i+1,j,n,m), Math.min(solve(s1,s2,i+1,j+1,n,m), solve(s1,s2,i,j+1,n,m)));
	}
	int minOperations(String s1, String s2) {
	    // add your logic here
		int n = s1.length();
		int m = s2.length();
		dp = new int[n+1][m+1];
		for(int i=0;i<=n;i++) {
			Arrays.fill(dp[i], -1);
		}
		return solve(s1,s2,0,0,n,m);
	}
}
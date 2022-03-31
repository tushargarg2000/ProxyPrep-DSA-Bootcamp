class Solution {
	int dp[][];
   int solve(String s1, String s2,int i,int j,int n,int m) {
	   if(i == n || j == m) {
		   return 0;
	   }
	   if(dp[i][j] != -1) {
		   return dp[i][j];
	   }
	   if(s1.charAt(i) == s2.charAt(j)) {
		   return dp[i][j] = 1 + solve(s1,s2,i+1,j+1,n,m);
	   }
	   return dp[i][j] = Math.max(solve(s1,s2,i+1,j,n,m),solve(s1,s2,i,j+1,n,m));
   }
   int getLengthOfLCS(String s1, String s2) {
       int n = s1.length();
       int m = s2.length();
	   dp = new int[n+1][m+1];
	   for(int i=0;i<=n;i++) {
		   for(int j=0;j<=m;j++) {
			   dp[i][j] = -1;
		   }
	   }
       return solve(s1,s2,0,0,n,m);
   }
}
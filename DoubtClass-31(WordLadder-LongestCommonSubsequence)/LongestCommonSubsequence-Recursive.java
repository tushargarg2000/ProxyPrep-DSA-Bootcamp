class Solution {
   int solve(String s1, String s2,int i,int j,int n,int m) {
	   if(i == n || j == m) {
		   return 0;
	   }
	   if(s1.charAt(i) == s2.charAt(j)) {
		   return 1 + solve(s1,s2,i+1,j+1,n,m);
	   }
	   return Math.max(solve(s1,s2,i+1,j,n,m),solve(s1,s2,i,j+1,n,m));
   }
   int getLengthOfLCS(String s1, String s2) {
       int n = s1.length();
       int m = s2.length();
       return solve(s1,s2,0,0,n,m);
   }
}
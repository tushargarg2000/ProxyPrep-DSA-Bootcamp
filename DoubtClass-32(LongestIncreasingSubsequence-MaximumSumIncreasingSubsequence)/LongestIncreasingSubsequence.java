class Solution {
   int getLengthOfLIS(int[] A) {
       int n = A.length;
       int lis[] = new int[n];
	   lis[0] = 1;
	   for(int i=1;i<n;i++) {
		   lis[i] = 1;
		   for(int j=0;j<i;j++) {
			   if(A[i] > A[j])
				lis[i] = Math.max(lis[i], lis[j]+1);
		   }
	   }
	   int ans = lis[0];
	   for(int i=1;i<n;i++) {
		   ans = Math.max(ans, lis[i]);
	   }
	   return ans;
   }
}

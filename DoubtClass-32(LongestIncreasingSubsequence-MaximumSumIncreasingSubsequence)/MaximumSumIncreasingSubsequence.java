class Solution {
	int maxSumSubsequence(int[] A) {
	    int n = A.length;
       int lis[] = new int[n];
	   lis[0] = A[0];
	   for(int i=1;i<n;i++) {
		   lis[i] = A[i];
		   for(int j=0;j<i;j++) {
			   if(A[i] > A[j])
				lis[i] = Math.max(lis[i], lis[j]+A[i]);
		   }
	   }
	   int ans = lis[0];
	   for(int i=1;i<n;i++) {
		   ans = Math.max(ans, lis[i]);
	   }
	   return ans;
	}
}
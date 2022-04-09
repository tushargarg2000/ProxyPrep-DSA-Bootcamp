class Solution {
   int maxProduct (int[] A) {
       if(A.length == 1) {
           return A[0];
       }
       int currMax = A[0], currMin = A[0], maxProductValue = A[0];
       for(int i = 1; i < A.length; i++) {
           int temp = Math.max(A[i], Math.max(A[i]*currMax, A[i]*currMin));
		   currMin = Math.min(A[i], Math.min(A[i]*currMin, A[i]*currMax));
		   currMax = temp;
		   maxProductValue = Math.max(maxProductValue, currMax);
       }
       return maxProductValue;
   }
}
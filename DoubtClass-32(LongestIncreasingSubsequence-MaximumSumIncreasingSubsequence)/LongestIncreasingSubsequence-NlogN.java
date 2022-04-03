class Solution {
   int getLengthOfLIS(int[] A) {
       int n = A.length;
	   int tailTable[] = new int[n];
	   int len = 1;
	   tailTable[0] = A[0];
	   for(int i=1;i<n;i++) {
		   if(A[i] < tailTable[0]) {
			   tailTable[0] = A[i];
		   }
		   else if(A[i] > tailTable[len-1]) {
			   tailTable[len++] = A[i];
		   }
		   else {
			   tailTable[getIndex(tailTable,-1,len-1,A[i])] = A[i];
		   }
	   }
	   return len;
   }
   int getIndex(int tailTable[], int l, int r, int key) {
        while (r - l > 1) {
            int m = l + (r - l) / 2;
            if (tailTable[m] >= key)
                r = m;
            else
                l = m;
        }
 
        return r;
    }
}
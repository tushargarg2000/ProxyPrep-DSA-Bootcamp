class Solution {
	int removeOccurences(int[] A, int k) {
		// add your logic here
		int n = A.length;
		int j = 0;
		for(int i=0;i<n;i++) {
			if(A[i] != k) {
				A[j] = A[i];
				j++;
			}
		}
		return j;
	}
}
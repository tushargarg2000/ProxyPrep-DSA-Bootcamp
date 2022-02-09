class Solution {
	int[] mergeSortedArrays(int[] A, int[] B) {
	    // add your logic here
		int n = A.length;
		int m = B.length;
		int ans[] = new int[n+m];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<n && j<m) {
			if(A[i] < B[j])
				ans[k++] = A[i++];
			else
				ans[k++] = B[j++];
		}
		while(i<n) {
			ans[k++] = A[i++];
		}
		while(j<m) {
			ans[k++] = B[j++];
		}
		return ans;
	}
}
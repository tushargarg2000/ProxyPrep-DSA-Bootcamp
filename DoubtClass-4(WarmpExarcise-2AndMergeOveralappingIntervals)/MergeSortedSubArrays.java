class Solution {
	void merge (int[] arr, int endIndex) {
		// add your logic here
		int n = arr.length;
		int A[] = new int[endIndex+1];
		int B[] = new int[n-(endIndex+1)];
		for(int k1=0;k1<=endIndex;k1++)
			A[k1] = arr[k1];
		for(int k2=endIndex+1;k2<n;k2++)
			B[k2-(endIndex+1)] = arr[k2];
		int i = 0;
		int j = 0;
		int k = 0;
		int m = endIndex+1;
		n = n - (endIndex+1);
		while(i<m && j<n) {
			if(A[i] < B[j])
				arr[k++] = A[i++];
			else
				arr[k++] = B[j++];
		}
		while(i<m) {
			arr[k++] = A[i++];
		}
		while(j<n) {
			arr[k++] = B[j++];
		}
	}
}
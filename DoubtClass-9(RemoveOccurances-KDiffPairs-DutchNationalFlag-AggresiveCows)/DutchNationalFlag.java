class Solution {
	void sortTheArray (int[] A) {
	    // add your logic here
		int n = A.length;
		int low = 0;
		int mid = 0;
		int high = n-1;
		while(mid <= high) {
			if(A[mid] == 0) {
				swap(A,low,mid);
				low++;
				mid++;
			}
			else if(A[mid] == 2) {
				swap(A,high,mid);
				high--;
			}
			else {
				mid++;
			}
		}
	}
	private void swap(int[] A,int i,int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
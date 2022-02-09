class Solution {
	void mergeSort (int[] arr) {
		// add your logic here
		sort(arr,0,arr.length-1);
	}
	private void sort(int[] arr,int l,int r) {
		if(l < r) {
			int mid = (l+r)/2;
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	private void merge(int[] arr,int l,int mid,int r) {
		int n = mid-l+1;
		int m = r-mid;
		int A[] = new int[n];
		int B[] = new int[m];
		for(int k1=0;k1<n;k1++)
			A[k1] = arr[l+k1];
		for(int k2=0;k2<m;k2++)
			B[k2] = arr[mid+1+k2];
		int i = 0;
		int j = 0;
		int k = l;
		while(i<n && j<m) {
			if(A[i] < B[j])
				arr[k++] = A[i++];
			else
				arr[k++] = B[j++];
		}
		while(i<n)
			arr[k++] = A[i++];
		while(j<m)
			arr[k++] = B[j++];
	}
}
class Solution {
	void quickSort (int[] arr) {
		// add your logic here
		sort(arr,0,arr.length-1);
	}
	private void sort(int[] arr,int l,int r) {
		if(l < r) {
			int pi = partition(arr,l,r);
			sort(arr,l,pi-1);
			sort(arr,pi+1,r);
		}
	}
	private int partition(int[] arr,int l,int r) {
		int pivot = arr[r];
		int i = l-1;
		for(int j=l;j<r;j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		i++;
		swap(arr,i,r);
		return i;
	}
	private void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
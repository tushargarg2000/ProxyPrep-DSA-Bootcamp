class Solution {
	void insertionSort (int[] arr) {
		// add your logic here
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		// alternate code using swap function
		// int n = arr.length;
		// for(int i=1;i<n;i++) {
		// 	int j = i-1;
		// 	while(j>=0 && arr[j] > arr[j+1]) {
		// 		swap(arr,j,j+1);
		// 		j--;
		// 	}
		// }
	}
	private void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
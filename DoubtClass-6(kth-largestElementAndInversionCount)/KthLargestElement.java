class Solution {
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
	int getKthLargestElement(int[] list, int k) {
	    // add your logic here
		// int n = list.length;
		// int index = n-k;
		// int start = 0;
		// int end = n-1;
		// while(start <= end) {
		// 	int pi = partition(list,start,end);
		// 	if(pi < index) {
		// 		start = pi+1;
		// 	}
		// 	else if(pi > index) {
		// 		end = pi-1;
		// 	}
		// 	else {
		// 		return list[pi];
		// 	}
		// }
		// return -1;
		int n = list.length;
		int index = n-k;
		int start = 0;
		int end = n-1;
		while(start <= end) {
			int pi = partition(list,start,end);
			if(pi == index) {
				return list[pi];
			}
			else if(pi > index) {
				end = pi-1;
			}
			else {
				start = pi+1;
			}
		}
		return -1;
		
	}
}
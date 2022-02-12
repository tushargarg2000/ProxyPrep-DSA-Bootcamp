class Solution {
	int getElementIndex(int[] array, int target) {
	    // add your logic here
		int n = array.length;
		int low = 0;
		int high = n-1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(array[mid] == target) {
				return mid;
			}
			if(array[low] <= array[mid]) {
				if(array[low] <= target && target <= array[mid]) {
					high = mid-1;
				}
				else {
					low = mid+1;
				}
			}
			else {
				if(array[mid] <= target && target <= array[high]) {
					low = mid+1;
				}
				else {
					high = mid-1;
				}
			}
		}
		return -1;
	}
}
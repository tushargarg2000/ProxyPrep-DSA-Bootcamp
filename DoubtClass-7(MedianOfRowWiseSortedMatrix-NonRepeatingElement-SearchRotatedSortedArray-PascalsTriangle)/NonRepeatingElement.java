class Solution {
	int findNonRepeatingElement (int[] arr) {
		// add your logic here
		int n = arr.length;
		int ans = arr[0];
		int low = 0;
		int high = n-1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(mid%2 == 0) {
				if(mid+1 != n && arr[mid] == arr[mid+1]) {
					low = mid+1;
				}
				else {
					ans = arr[mid];
					high = mid-1;
				}
			}
			else {
				if(arr[mid] == arr[mid-1]) {
					low = mid+1;
				}
				else {
					high = mid-1;
				}
			}
		}
		return ans;
	}
}
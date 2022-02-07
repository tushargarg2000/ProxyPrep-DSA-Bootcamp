class Solution {
	int[] getSquareSortedArray (int[] arr) {
		// add your logic here
		int n = arr.length;
		for(int i=0;i<n;i++) {
			arr[i] = arr[i]*arr[i];
		}
		Arrays.sort(arr); // O(nlogn)
		return arr;
	}
}

// sort(v.begin(),v.end())
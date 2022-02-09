class Solution {
	boolean isArithmeticSequence (int[] arr) {
		// add your logic here
		Arrays.sort(arr);
		int n = arr.length;
		for(int i=1;i<n-1;i++) {
			if(2*arr[i] != arr[i-1] + arr[i+1]) {
				return false;
			}
		}
		return true;
	}
}
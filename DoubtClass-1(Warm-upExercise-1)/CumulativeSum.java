class Solution {
	int[] getCumulativeSum (int[] arr) {
		// add your logic here
		// for(int i=1;i<arr.length;i++)
		// 	arr[i] += arr[i-1];
		// return arr;
		int n = arr.length;
		int p[] = new int[n];
		p[0] = arr[0];
		for(int i=1;i<n;i++) {
			p[i] = arr[i] + p[i-1];
		}
		return p;
	}
}
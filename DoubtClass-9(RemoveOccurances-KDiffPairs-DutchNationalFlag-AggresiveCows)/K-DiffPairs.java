class Solution {
	int kDiffPairs (int[] A, int k) {
		// add your logic here
		int n = A.length;
		int i = 0;
		int j = 1;
		int ans = 0;
		while(j < n) {
			// second edge case
			while(j<n-1 && A[j] == A[j+1]) {
				j++;
			}
			int diff = A[j] - A[i];
			if(diff == k) {
				ans++;
				i++;
				j++;
			}
			else if(diff < k) {
				j++;
			}
			else {
				i++;
			}
			// first edge case
			if(i == j) {
				j++;
			}
		}
		return ans;
	}
}
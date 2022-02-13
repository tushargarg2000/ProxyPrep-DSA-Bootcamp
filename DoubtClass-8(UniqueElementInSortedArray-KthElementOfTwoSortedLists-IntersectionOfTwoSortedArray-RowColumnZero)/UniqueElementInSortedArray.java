class Solution {
	int removeDuplicates(int[] A) {
	    // add logic here
		// int n = A.length;
		// int ans = 1;
		// for(int i=1;i<n;i++) {
		// 	if(A[i] != A[i-1]) {
		// 		ans++;
		// 	}
		// }
		// return ans;
		int n = A.length;
		int count = 1;
		for(int i=1;i<n;i++) {
			if(A[i] != A[i-1]) {
				count++;
			}
		}
		return count;
	}
}
class Solution {
	List<Integer> intersection (int[] A, int[] B) {
		// add your logic here
		List<Integer> ans = new ArrayList<>();
		int n = A.length;
		int m = B.length;
		int i = 0;
		int j = 0;
		while(i < n && j < m) {
			if(A[i] == B[j]) {
				ans.add(A[i]);
				i++;
				j++;
			}
			else if(A[i] < B[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		return ans;
	}
}
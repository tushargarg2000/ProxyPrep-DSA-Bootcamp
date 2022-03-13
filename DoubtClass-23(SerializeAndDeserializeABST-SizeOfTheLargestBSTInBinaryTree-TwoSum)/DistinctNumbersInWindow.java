class Solution {
	int[] distintNumbersInWindow(int[] A, int k) {
	    // add your logic here
		int n = A.length;
		int[] ans = new int[n-k+1];
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i=0;i<k;i++) {
			hashMap.put(A[i], hashMap.getOrDefault(A[i], 0) + 1);
		}
		for(int i=k;i<n;i++) {
			ans[i-k] = hashMap.size();
			if(hashMap.get(A[i-k]) == 1) {
				hashMap.remove(A[i-k]);
			}
			else {
				hashMap.put(A[i-k], hashMap.get(A[i-k]) - 1);
			}
			hashMap.put(A[i], hashMap.getOrDefault(A[i], 0) + 1);
		}
		ans[n-k] = hashMap.size();
		return ans;
	}
}
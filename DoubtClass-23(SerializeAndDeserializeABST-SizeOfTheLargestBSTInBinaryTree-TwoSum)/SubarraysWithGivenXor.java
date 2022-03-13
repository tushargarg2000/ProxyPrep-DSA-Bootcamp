class Solution {
	int numSubarrayWithXOR(int[] A, int target) {
	    // add your logic here
		int n = A.length;
		int prefix = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int ans = 0;
		for(int i=0;i<n;i++) {
			prefix ^= A[i];
			if(prefix == target) {
				ans++;
			}
			if(hashMap.get(prefix^target) != null) {
				ans += hashMap.get(prefix^target);
			}
			hashMap.put(prefix, hashMap.getOrDefault(prefix, 0) + 1);
		}
		return ans;
	}
}
class Solution {
	int[] twoSum(int[] A, int target) {
	    // add your logic here
		int n = A.length;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int[] ans = new int[2];
		for(int i=0;i<n;i++) {
			int index = hashMap.getOrDefault(target - A[i], -1);
			if(index != -1) {
				ans[0] = index;
				ans[1] = i;
				break;
			}
			hashMap.put(A[i],i);
		}
		return ans;
	}
}
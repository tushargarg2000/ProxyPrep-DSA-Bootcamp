class Solution {
	int findNonRepeatingElement (int[] arr) {
		// add your logic here
		HashMap<Integer,Integer> map = new HashMap<>();
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],2);
			}
			else {
				map.put(arr[i],1);
			}
		}
		for(Integer key: map.keySet()) {
			if(map.get(key) == 1) {
				return key;
			}
		}
		return -1;
	}
}
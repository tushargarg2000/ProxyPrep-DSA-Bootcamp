class Solution {
	public void combinationsUtil(int curr, int n, int k, List<List<Integer>> result, List<Integer> current) {
		if (k == 0) {
			result.add(new ArrayList<>(current));
		}

		for (int i = curr; i <= n; i++) {
			current.add(i);
			combinationsUtil(i + 1, n, k - 1, result, current);
			current.remove(current.size() - 1);
		}
	}

	List<List<Integer>> combinations(int n, int k) {
	    // add your logic here
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> current = new ArrayList<Integer>();
		combinationsUtil(1, n, k, result, current);
		return result;
	}
}
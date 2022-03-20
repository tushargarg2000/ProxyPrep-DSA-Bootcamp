class Solution {
	void findAllCombinations(int[] A, int val, int start, int sum, List<Integer> currentCombination, List<List<Integer>> allCombinations) {
		if(sum == val) {
			allCombinations.add(new ArrayList<> (currentCombination));
			return;
		}
		for (int i = start; i < A.length; i++) {
			if(A[i] + sum > val) {
				continue;
			}
			if(i > start && A[i] == A[i - 1]) {
				continue;
			}
			currentCombination.add(A[i]);
			findAllCombinations(A, val, i + 1, sum + A[i], currentCombination, allCombinations);
			currentCombination.remove(currentCombination.size() - 1);
		}
	}
	List<List<Integer>> combinationSum(int[] A, int val) {
	    List<List<Integer>> allCombinations = new ArrayList<List<Integer>> ();
		List<Integer> currentCombination = new ArrayList<Integer> ();
		Arrays.sort(A);
		findAllCombinations(A, val, 0, 0, currentCombination, allCombinations);
		return allCombinations;
	}
}
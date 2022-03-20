class Solution {
	List<List<Integer>> combinationSum(int[] A, int val) {
	    // add your logic here
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> curr = new ArrayList<>();
		findAllCombinations(A, val, 0, result, curr);
		return result;
	}
	void findAllCombinations(int[] A,int val,int index, List<List<Integer>> result, List<Integer> curr) {
		if(val == 0) {
			result.add(new ArrayList<>(curr));
			return;
		}
		if(index == A.length || val < 0) {
			return;
		}
		curr.add(A[index]);
		findAllCombinations(A, val - A[index], index, result, curr);
		curr.remove(curr.size()-1);
		findAllCombinations(A, val, index+1, result, curr);
	}
}
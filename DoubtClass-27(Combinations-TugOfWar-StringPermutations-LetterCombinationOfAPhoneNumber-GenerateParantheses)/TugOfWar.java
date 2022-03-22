class Solution {
	static int minDiff;
	void getPartition(int[] A, int selectedStudents, int start, int currSum, int totalSum) {
		if (start == A.length) {
			return;
		}
		if (selectedStudents == A.length/2) {
			minDiff = Math.min(minDiff, Math.abs(totalSum - 2 * currSum));
			return;
		}
		getPartition(A, selectedStudents + 1, start + 1, currSum + A[start], totalSum);
		getPartition(A, selectedStudents, start + 1, currSum, totalSum);
	}
	int divideGroup(int[] A) {
	    int totalSum = 0;
		for (int i = 0; i < A.length; i++) {
			totalSum += A[i];
		}
		minDiff = Integer.MAX_VALUE;
		getPartition(A, 0, 0, 0, totalSum);
		return minDiff;
	}
}
class Solution {
	int[][] rotateMatrix(int[][] matrix){
	    int n = matrix.length;
		int m = matrix[0].length;
		int ans[][] = new int[m][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				ans[j][n-1-i] = matrix[i][j];
			}
		}
		return ans;
	}
}
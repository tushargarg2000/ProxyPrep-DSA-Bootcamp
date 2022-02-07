class Solution {
   boolean searchMatrix(int[][] matrix, int key){
       int n = matrix.length;
	   int m = matrix[0].length;
	   int row = -1;
	   int low = 0;
	   int high = n-1;
	   while(low <= high) {
		   int mid = (low + high)/2;
		   if(matrix[mid][0] <= key && key <= matrix[mid][m-1]) {
			   row = mid;
			   break;
		   }
		   if(matrix[mid][0] > key) {
			   high = mid-1;
		   }
		   else {
			   low = mid+1;
		   }
	   }
	   if(row == -1) {
		   return false;
	   }
	   low = 0;
	   high = m-1;
	   while(low <= high) {
		   int mid = (low + high)/2;
		   if(matrix[row][mid] == key) {
			   return true;
		   }
		   if(matrix[row][mid] > key) {
			   high = mid-1;
		   }
		   else {
			   low = mid+1;
		   }
	   }
	   return false;
   }
}
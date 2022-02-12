class Solution {
	int calculateMedianOfMatrix(int[][] matrix){
		// int n = matrix.length;
		// int m = matrix[0].length;
		// int min = Integer.MAX_VALUE;
		// int max = Integer.MIN_VALUE;
		// for(int i=0;i<n;i++) {
		// 	min = Math.min(min,matrix[i][0]);
		// 	max = Math.max(max,matrix[i][m-1]);
		// }
		// int target = (n*m + 1)/2;
		// int ans = min;
		// while(min <= max) {
		// 	int mid = (min + max)/2;
		// 	int count = 0;
		// 	for(int i=0;i<n;i++) {
		// 		int index = upperBound(matrix[i],mid);
		// 		count += index;
		// 	}
		// 	if(count < target) {
		// 		min = mid+1;
		// 	}
		// 	else {
		// 		ans = mid;
		// 		max = mid-1;
		// 	}
		// }
		// return ans;
		int n = matrix.length;
		int m = matrix[0].length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			min = Math.min(min,matrix[i][0]);
			max = Math.max(max,matrix[i][m-1]);
		}
		int target = (n*m + 1)/2;
		int ans = min;
		while(min <= max) {
			int mid = (min + max)/2;
			int count = 0;
			for(int i=0;i<n;i++) {
				count += upperBound(matrix[i],mid);
			}
			if(count < target) {
				min = mid+1;
			}
			else {
				ans = mid;
				max = mid-1;
			}
		}
		return ans;
	}
	// int upperBound(int arr[],int key) {
	// 	int n = arr.length;
	// 	int low = 0;
	// 	int high = n-1;
	// 	int ans = low;
	// 	while(low <= high) {
	// 		int mid = (low + high)/2;
	// 		if(key >= arr[mid]) {
	// 			ans = mid+1;
	// 			low = mid+1;
	// 		}
	// 		else {
	// 			high = mid-1;
	// 		}
	// 	}
	// 	return ans;
	// }
	int upperBound(int arr[],int key) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		int ans = 0;
		while(low <= high) {
			int mid = (low + high)/2;
			if(key >= arr[mid]) {
				ans = mid+1;
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return ans;
	}
}
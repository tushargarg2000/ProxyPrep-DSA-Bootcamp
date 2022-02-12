class Solution {
	int[] pascalTriangleRow(int rowNo) {
		int ar[] = new int[rowNo];
		int temp = 1;
		for(int i=1;i<=rowNo;i++) {
			ar[i-1] = temp;
			temp = temp*(rowNo-i)/i;
		}
		return ar;
	}
}

// class Solution {
// 	int[] pascalTriangleRow(int rowNo) {
// 		int ar[][] = new int[rowNo][rowNo];
// 		ar[0][0] = 1;
// 		for(int i=1;i<rowNo;i++) {
// 			ar[i][0] = ar[i][i] = 1;
// 			for(int j=1;j<i;j++) {
// 				ar[i][j] = ar[i-1][j] + ar[i-1][j-1];
// 			}
// 		}
// 		return ar[rowNo-1];
// 	}
// }

// class Solution {
// 	int[] pascalTriangleRow(int rowNo) {
// 		int ar[] = new int[rowNo];
// 		int dp[] = new int[rowNo];
// 		ar[0] = dp[0] = 1;
// 		for(int i=1;i<rowNo;i++) {
// 			for(int j=1;j<i;j++) {
// 				ar[j] += dp[j-1];
// 			}
// 			ar[i] = 1;
// 			for(int k=0;k<rowNo;k++) {
// 				dp[k] = ar[k];
// 			}
// 		}
// 		return ar;
// 	}
// }
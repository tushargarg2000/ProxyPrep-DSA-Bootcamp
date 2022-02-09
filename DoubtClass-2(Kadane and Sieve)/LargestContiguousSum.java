class Solution {
	int largestContiguousSum(int[] arr){
		int ans = Integer.MIN_VALUE;
		int n = arr.length;
		int sum = 0; // MSS -> (i-1)
		for(int i=0;i<n;i++) {
			sum = arr[i] + Math.max(0,sum); // MSS -> i
			ans = Math.max(ans,sum);
		}
		return ans;
	}
}

// int ans = INT_MIN;
// ans = max(ans,curr);
// O(N^3)
// class Solution {
// 	int largestContiguousSum(int[] arr){
// 		int ans = Integer.MIN_VALUE; // ans should be greater than this ??
// 		int n = arr.length;
// 		for(int i=0;i<n;i++) { // i -> starting index
// 			for(int j=i;j<n;j++) { // j -> ending index
// 				int curr = 0;
// 				for(int k=i;k<=j;k++) { // k -> (i,j) 
// 					curr += arr[k]; // sum of all elements of sub-array
// 				}
// 				ans = Math.max(ans,curr);
// 			}
// 		}
// 		return ans;
// 	}
// }
// O(N^2)
// class Solution {
// 	int largestContiguousSum(int[] arr){
// 		int ans = Integer.MIN_VALUE;
// 		int n = arr.length;
// 		int sum = 0;
// 		for(int i=0;i<n;i++) {
// 			sum += arr[i]; // prefix sum till index i
// 			int sum1 = sum;
// 			for(int j=0;j<=i;j++) { // one by one subracting from the left end
// 				ans = Math.max(ans,sum);
// 				sum -= arr[j]; // sum of subarray ending at index i
// 			}
// 			sum = sum1;
// 		}
// 		return ans;
// 	}
// }
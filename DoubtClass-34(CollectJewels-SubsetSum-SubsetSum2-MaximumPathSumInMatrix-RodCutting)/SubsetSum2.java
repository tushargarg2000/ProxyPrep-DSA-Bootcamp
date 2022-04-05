class Solution {
	int dp[][];
	int solve(int[] A,int n,int target) {
		if(target == 0) {
			return 1;
		}
		if(n == 0) {
			return 0;
		}
		if(dp[n][target] != -1) {
			return dp[n][target];
		}
		if(A[n-1] > target) {
			return dp[n][target] = solve(A,n-1,target);
		}
		return dp[n][target] = solve(A,n-1,target) | solve(A,n-1,target - A[n-1]);
	}
	int subsetSum(int[] A, int target) {
	    // add you logic here
		int n = A.length;
		dp = new int[n+1][target+1];
		for(int i=0;i<=n;i++) {
			Arrays.fill(dp[i], -1);
		}
		return solve(A,n,target);
	}
}
class Solution {
	int[][] dp;
	int palindrome(String s, int start, int end) {
		while(start < end) {
			if(s.charAt(start) != s.charAt(end)) {
				return 0;
			}
			start++;
			end--;
		}
		return 1;
	}
	int minCuts(String s, int i, int j) {
		if(palindrome(s, i, j) == 1 || j <= i) {
			return 0;
		}
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		int result = Integer.MAX_VALUE, cutCounter;
		for(int k = i; k < j; k++) {
			cutCounter = minCuts(s, i, k) + minCuts(s, k + 1, j) + 1;
			result = Math.min(result, cutCounter);
		}
		return dp[i][j] = result;
	}
	int getMinCuts(String s) {
		dp = new int[s.length() + 1][s.length() + 1];
		for(int i = 0; i <= s.length(); i++) {
			Arrays.fill(dp[i], -1);
		}
	    return minCuts(s, 0, s.length() - 1);
	}
}

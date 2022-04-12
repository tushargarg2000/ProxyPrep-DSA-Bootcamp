class Solution {
	Boolean dp[];
	boolean wordBreakUtil(String s, int start, String[] w) {
		if (start == s.length()) {
			return true;
		}
		if(dp[start] != null) {
			return dp[start];
		}
		for (int i = start; i < s.length(); i++) {
			String currWord = s.substring(start, i + 1);
			for(int j = 0; j < w.length; j++) {
				if (currWord.equals(w[j])) {
					if(wordBreakUtil(s, i + 1, w)) {
						return dp[start] = true;
					}
				}
			}
		}
		return dp[start] = false;
	}
	boolean wordBreak (String s, String[] w) {
		dp = new Boolean[s.length() + 1];
	    return wordBreakUtil(s, 0, w);
	}
}
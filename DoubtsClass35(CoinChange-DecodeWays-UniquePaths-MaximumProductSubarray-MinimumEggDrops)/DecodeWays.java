class Solution {
	int mod = 1000000007;
	HashMap<Integer, Integer> memoize = new HashMap<Integer, Integer>();
	int countWays(String str, int start, int end) {
		if(start > end || (start == end && str.charAt(start) != '0')) {
			return 1;
		} 
		if (str.charAt(start) == '0') {
			return 0;
		}
		if(memoize.containsKey(start)) {
			return memoize.get(start);
		}
		int ways = 0;
		ways = (ways + countWays(str, start + 1, end)) % mod;
		if (start < end && (str.charAt(start) == '1' || str.charAt(start) <= '2' && str.charAt(start + 1) <= '6') ){
			ways = (ways + countWays(str, start + 2, end)) % mod;
		} 
		memoize.put(start, ways);
		return ways;
	}
	int numDecodings(String str) {
	    memoize.clear();
    	return countWays(str, 0, str.length() - 1);
	}
}
class Solution {
	HashMap<Integer, List<String>> memoize = new HashMap<Integer, List<String>>();
	List<String> getSentences(String s, int start, String[] w) {
		List<String> subSequence = new ArrayList<String>();
		List<String> nextSequence = new ArrayList<String>();
		if (memoize.containsKey(start)) {
			return memoize.get(start);
		}
		for (int i = start; i < s.length(); i++) {
			String currWord = s.substring(start, i + 1);
			for(int j = 0; j < w.length; j++) {
				if (currWord.equals(w[j])) {
					if (i + 1 == s.length()) {
						subSequence.add(currWord);
					} else {
						nextSequence = getSentences(s, i + 1, w);
						for (int k = 0; k < nextSequence.size(); k++) {
							subSequence.add(currWord + " " + nextSequence.get(k));
						}
					}
					break;
				}
			}
		}
		memoize.put(start, subSequence);
		return subSequence;
	}
	List<String> wordBreak (String s, String[] w) {
	    memoize.clear();
		return getSentences(s, 0, w);
	}
}
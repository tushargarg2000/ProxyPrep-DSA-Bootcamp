class Solution {
	boolean wordBreak (String s, String[] w) {
	    // add your logic here
		HashSet<String> hashSet = new HashSet<>();
		for(int i=0;i<w.length;i++) {
			hashSet.add(w[i]);
		}
		return wordBreakHelper(s,0,hashSet);
	}
	boolean wordBreakHelper(String s,int index,HashSet<String> hashSet) {
		if(index == s.length()) {
			return true;
		}
		for(int i=index;i<s.length();i++) {
			if(hashSet.contains(s.substring(index,i+1))) {
				boolean ans = wordBreakHelper(s, i+1, hashSet);
				if(ans) {
					return true;
				}
			}
		}
		return false;
	}
}
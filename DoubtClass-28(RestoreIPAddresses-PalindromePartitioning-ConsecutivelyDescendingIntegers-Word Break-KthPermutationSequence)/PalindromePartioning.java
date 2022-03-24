class Solution {
	List<List<String>> getPartitions(String s) {
	    // add logic here
		int n = s.length();
        List<List<String>> allPart = new ArrayList<>();
        Deque<String> currPart = new LinkedList<String>();
        allPalPartitonsUtil(allPart, currPart, 0, n, s);
		return allPart;
	}
	void allPalPartitonsUtil(List<List<String>> allPart, Deque<String> currPart, int start, int n, String s)
    {
        if (start >= n) 
        {
            allPart.add(new ArrayList<>(currPart));
            return;
        }
        for (int i = start; i < n; i++) 
        {
            if (isPalindrome(s, start, i))
            {
                currPart.addLast(s.substring(start, i + 1));
                allPalPartitonsUtil(allPart, currPart, i + 1, n, s);
                currPart.removeLast();
            }
        }
    }
    boolean isPalindrome(String s,int start, int i)
    {
        while (start < i) 
        {
            if (s.charAt(start++) != s.charAt(i--))
                return false;
        }
        return true;
    }
}
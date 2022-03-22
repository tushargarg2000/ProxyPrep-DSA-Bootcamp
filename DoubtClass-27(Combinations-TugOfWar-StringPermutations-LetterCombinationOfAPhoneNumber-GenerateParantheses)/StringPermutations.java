class Solution {
	static List<String> getAllPermutations(String s) {
		ArrayList<String> arr = new ArrayList<>();
		permute(s, 0, s.length() - 1, arr);
		return arr;
	}
	public static void permute(String s, int left, int right,ArrayList<String> arr) {
        if (left == right) {
            arr.add(s);
		}
        else {
            for (int i = left; i <= right; i++) {
                s = swap(s, left, i);
                permute(s, left+1, right,arr);
                s = swap(s, left, i);
            }
        }
    }
    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
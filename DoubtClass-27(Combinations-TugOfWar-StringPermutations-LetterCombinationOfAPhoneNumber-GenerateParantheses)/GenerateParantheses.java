class Solution {
	List<String> ans;
	List<String> generateParentheses(int n) {
	    // add your logic here
		ans = new ArrayList<>();
		StringBuilder sb = new StringBuilder("");
		generateParenthesesHelper(0,0,n,sb);
		return ans;
	}
	void generateParenthesesHelper(int open,int close,int n, StringBuilder sb) {
		if(open == close) {
			if(n == 0) {
				ans.add(sb.toString());
				return;
			}
			sb.append("(");
			generateParenthesesHelper(open+1,close,n-1,sb);
			sb.deleteCharAt(sb.length()-1);
		}
		else {
			if(n == 0) {
				sb.append(")");
				generateParenthesesHelper(open,close+1,n,sb);
				sb.deleteCharAt(sb.length()-1);
			}
			else {
				sb.append("(");
				generateParenthesesHelper(open+1,close,n-1,sb);
				sb.deleteCharAt(sb.length()-1);
				sb.append(")");
				generateParenthesesHelper(open,close+1,n,sb);
				sb.deleteCharAt(sb.length()-1);
			}
		}
	}
}
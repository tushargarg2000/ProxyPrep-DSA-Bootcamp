class Solution {
	boolean isBalancedParentheses(String str) {
	    int n = str.length();
		Stack<Character> openingBrackets = new Stack<>();
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				openingBrackets.push(str.charAt(i));
			} else {
				if (openingBrackets.empty()) {
					return false;
				}
				if (str.charAt(i) == ')') {
					char last = openingBrackets.peek();
					openingBrackets.pop();
					if (last != '(') {
						return false;
					}
				}
				if (str.charAt(i) == '}') {
					char last = openingBrackets.peek();
					openingBrackets.pop();
					if (last != '{') {
						return false;
					}
				}
				if (str.charAt(i) == ']') {
					char last = openingBrackets.peek();
					openingBrackets.pop();
					if (last != '[') {
						return false;
					}
				}
			}
		}
		return openingBrackets.isEmpty();
	}
}

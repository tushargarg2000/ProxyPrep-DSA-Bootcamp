class Solution {
	int evalRPN (String[] tokens) {
		// add your logic here
		int n = tokens.length;
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<n;i++) {
			if(tokens[i].equals("+")) {
				int x = stack.pop();
				int y = stack.pop();
				int z = y+x;
				stack.push(z);
			}
			else if(tokens[i].equals("-")) {
				int x = stack.pop();
				int y = stack.pop();
				int z = y-x;
				stack.push(z);
			}
			else if(tokens[i].equals("*")) {
				int x = stack.pop();
				int y = stack.pop();
				int z = y*x;
				stack.push(z);
			}
			else if(tokens[i].equals("/")) {
				int x = stack.pop();
				int y = stack.pop();
				int z = y/x;
				stack.push(z);
			}
			else {
				stack.push(Integer.parseInt(tokens[i]));
			}
		}
		return stack.pop();
	}
}

// string str = "123";
// int x = stoi(str);

// string str2 = to_string(x);

// String str2 = x + "";



class Solution {
	String simplifyPath (String path) {
		// add your logic here
		Stack<String> stack = new Stack<>();
		StringBuilder res = new StringBuilder("/");
		int n = path.length();
		for(int i=0;i<n;i++) {
			StringBuilder dir = new StringBuilder("");
            while (i < n && path.charAt(i) == '/')
                i++;
            while (i < n && path.charAt(i) != '/') {
                dir.append(path.charAt(i));
                i++;
            }
            if (dir.toString().equals("..") == true) {
                if (!stack.empty()) {
                    stack.pop();    
				}
            }
            else if (dir.toString().equals(".") == true) {
                continue;
			}
			else if (dir.length() != 0) {
                stack.push(dir.toString());
			}
		}
		
		Stack<String> st = new Stack<>();
        while (!stack.empty()) { 
            st.push(stack.pop());
        }
        
        while (!st.empty()) {
            if (st.size() != 1)
                res.append(st.pop() + "/");
            else
                res.append(st.pop());
        }
		
        return res.toString();
	}
}
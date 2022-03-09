class Solution {
	/* This is the Node class definition
	
	class Node {
		public Node left;
		public Node right;
		public int data;

		public Node(int data) {
			this.data = data;
		}
	}
	*/
	int maxVal (Node root) {
		int ans = Integer.MIN_VALUE;
		if(root.left != null) {
			ans = Math.max(ans, maxVal(root.left));
		}
		ans = Math.max(ans, root.data);
		if(root.right != null) {
			ans = Math.max(ans, maxVal(root.right));
		}
		return ans;
	}
	int minVal (Node root) {
		int ans = Integer.MAX_VALUE;
		if(root.left != null) {
			ans = Math.min(ans, minVal(root.left));
		}
		ans = Math.min(ans, root.data);
		if(root.right != null) {
			ans = Math.min(ans, minVal(root.right));
		}
		return ans;
	}
	boolean isBst(Node root) {
	    if (root == null) {
			return true;
		}
		if (root.left != null && maxVal(root.left) >= root.data) {
			return false;
		}
		if (root.right != null && minVal(root.right) <= root.data) {
			return false;
		}
		if (isBst(root.left) == false || isBst(root.right) == false) {
			return false;
		}
		return true;
	}
}

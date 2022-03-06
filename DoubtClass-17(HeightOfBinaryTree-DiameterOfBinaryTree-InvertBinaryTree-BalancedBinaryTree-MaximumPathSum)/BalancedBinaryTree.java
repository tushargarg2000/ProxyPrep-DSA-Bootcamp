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
	boolean ans;
	boolean isBinaryTreeBalanced(Node root) {
	    // add your logic here
		ans = true;
		isBinaryTreeBalancedHelper(root);
		return ans;
	}
	int isBinaryTreeBalancedHelper(Node root) {
		if(root == null) {
			return 0;
		}
		int left = isBinaryTreeBalancedHelper(root.left);
		int right = isBinaryTreeBalancedHelper(root.right);
		if(Math.abs(left-right) > 1) {
			ans = false;
		}
		return 1 + Math.max(left, right);
	}
}
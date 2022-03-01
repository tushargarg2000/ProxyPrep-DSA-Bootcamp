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
	int ans;
	int maxPathSum(Node root) {
	    // add your logic here
		ans = Integer.MIN_VALUE;
		maxPathSumHelper(root);
		return ans;
	}
	int maxPathSumHelper(Node root) {
		if(root == null) {
			return 0;
		}
		int left = maxPathSumHelper(root.left);
		int right = maxPathSumHelper(root.right);
		ans = Math.max(ans, root.data + Math.max(left, right));
		ans = Math.max(ans, root.data + left + right);
		ans = Math.max(ans, root.data);
		return Math.max(root.data, root.data + Math.max(left, right));
	}
}
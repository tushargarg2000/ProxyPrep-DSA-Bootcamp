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
	int count;
	int findKthLargest(Node root, int k) {
	    // add your logic here
		count = 0;
		return findKthLargestHelper(root, k);
	}
	int findKthLargestHelper(Node root,int k) {
		if(root == null) {
			return -1;
		}
		int right = findKthLargestHelper(root.right,k);
		if(right != -1) {
			return right;
		}
		count++;
		if(count == k) {
			return root.data;
		}
		return findKthLargestHelper(root.left, k);
	}
}
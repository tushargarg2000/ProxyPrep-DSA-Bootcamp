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
	int findKthSmallest(Node root, int k) {
	    // add your logic here
		count = 0;
		return findKthSmallestHelper(root, k);
	}
	int findKthSmallestHelper(Node root,int k) {
		if(root == null) {
			return -1;
		}
		int left = findKthSmallestHelper(root.left,k);
		if(left != -1) {
			return left;
		}
		count++;
		if(k == count) {
			return root.data;
		}
		return findKthSmallestHelper(root.right, k);
	}
}
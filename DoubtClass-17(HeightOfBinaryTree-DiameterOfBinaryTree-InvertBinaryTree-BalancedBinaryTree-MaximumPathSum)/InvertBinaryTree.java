class Solution {
	void invertTree(Node root) {
    	// add your logic here
		invertTreeHelper(root);
	}
	Node invertTreeHelper(Node root) {
		if(root == null) {
			return null;
		}
		Node L = invertTreeHelper(root.left);
		Node R = invertTreeHelper(root.right);
		root.left = R;
		root.right = L;
		return root;
	}
}
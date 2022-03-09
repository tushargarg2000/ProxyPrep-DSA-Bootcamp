
	Node removeFromBst(Node root, int key) {
	    if (root == null) {
			return null;
		}
		if (root.data > key) {
			root.left = removeFromBst(root.left, key);
			return root;
		} 
		if (root.data < key) {
			root.right = removeFromBst(root.right, key);
			return root;
		}
		if (root.left == null) {
			return root.right;
		} 
		if (root.right == null) {
			return root.left;
		}
		Node currNode = root.right;
		while (currNode.left != null) {
			currNode = currNode.left;
		}
		currNode.left = root.left;
		return root.right;
	}
}

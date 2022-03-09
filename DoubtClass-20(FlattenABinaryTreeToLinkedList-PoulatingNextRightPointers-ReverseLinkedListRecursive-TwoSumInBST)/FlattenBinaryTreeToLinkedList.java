/* This is the Node class definition

class Node {
	public Node left;
    public Node right;
    int data;

    Node(int data) {
        this.data = data;
    }
}
*/

class Solution {
	void flatten(Node root) {
    	// add your logic here
		solve(root);
	}
	Node solve(Node root) {
		if(root == null) {
			return null;
		}
		if(root.left == null && root.right == null) {
			return root;
		}
		if(root.left == null) {
			return solve(root.right);
		}
		if(root.right == null) {
			Node left = solve(root.left);
			root.right = root.left;
			root.left = null;
			return left;
		}
		Node left = solve(root.left);
		Node right = root.right;
		root.right = root.left;
		left.right = right;
		root.left = null;
		return solve(right);
	}
}
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
    boolean findPair (Node root, int k, HashMap<Integer, Integer> nodeData) {
		if (root == null) {
			return false;
		}
		if (findPair (root.left, k, nodeData)) {
			return true;
		}
		if (nodeData.get(k - root.data) != null) {
			return true;
		}
		nodeData.put(root.data, 1);
		if (findPair (root.right, k, nodeData)) {
			return true;
		}
		return false;
	}
	boolean pairExists(Node root, int k) {
	    HashMap<Integer, Integer> nodeData = new HashMap<> ();
		return findPair (root, k, nodeData);
	}
}
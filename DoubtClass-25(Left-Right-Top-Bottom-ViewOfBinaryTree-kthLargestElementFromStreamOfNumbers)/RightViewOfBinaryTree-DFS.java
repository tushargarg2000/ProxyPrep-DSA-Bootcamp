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
	static int maxDepth;
	void getRightView(Node root, List<Integer> treeRightView, int currentDepth) {
		if(root == null) {
			return;
		}
		currentDepth++;
		if(currentDepth > maxDepth) {
			treeRightView.add(root.data);
			maxDepth = currentDepth;
		}
		getRightView(root.right, treeRightView, currentDepth);
		getRightView(root.left, treeRightView, currentDepth);
	}
	int[] rightView(Node root) {
		List<Integer> treeRightView = new ArrayList<Integer> ();
		maxDepth = 0;
		getRightView(root, treeRightView, 0);
		int[] temp = new int[treeRightView.size()];
		for(int i = 0; i < treeRightView.size(); i++) {
			temp[i] = treeRightView.get(i);
		}
		return temp;
	}
}
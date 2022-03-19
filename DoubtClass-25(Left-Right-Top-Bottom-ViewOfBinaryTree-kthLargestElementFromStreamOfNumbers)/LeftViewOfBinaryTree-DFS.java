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
	void getLeftView(Node root, List<Integer> treeLeftView, int currentDepth) {
		if(root == null) {
			return;
		}
		currentDepth++;
		if(currentDepth > maxDepth) {
			treeLeftView.add(root.data);
			maxDepth = currentDepth;
		}
		getLeftView(root.left, treeLeftView, currentDepth);
		getLeftView(root.right, treeLeftView, currentDepth);
	}
	int[] leftView(Node root) {
		List<Integer> treeLeftView = new ArrayList<Integer> ();
		maxDepth = 0;
		getLeftView(root, treeLeftView, 0);
		int[] temp = new int[treeLeftView.size()];
		for(int i = 0; i < treeLeftView.size(); i++) {
			temp[i] = treeLeftView.get(i);
		}
		return temp;
	}
}
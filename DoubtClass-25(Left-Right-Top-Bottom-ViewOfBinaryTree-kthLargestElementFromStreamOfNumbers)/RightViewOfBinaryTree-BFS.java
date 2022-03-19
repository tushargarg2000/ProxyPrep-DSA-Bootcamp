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
	
	int[] rightView(Node root) {
	    Queue<Node> treeNodes = new LinkedList<Node> ();
		List<Integer> treeRightView = new ArrayList<Integer> ();
		treeNodes.add(root);
		while (!treeNodes.isEmpty()) {
			int n = treeNodes.size();
			for (int i = 0; i < n; i++) {
				Node currentNode = treeNodes.peek();
				treeNodes.poll();
				if (i == 0) {
					treeRightView.add(currentNode.data);
				}
				if (currentNode.right != null) {
					treeNodes.add(currentNode.right);
				}
				if (currentNode.left != null) {
					treeNodes.add(currentNode.left);
				}
			}
		}
		int[] temp = new int[treeRightView.size()];
		for (int i = 0; i < treeRightView.size(); i++) {
			temp[i] = treeRightView.get(i);
		}
		return temp;
	}
}
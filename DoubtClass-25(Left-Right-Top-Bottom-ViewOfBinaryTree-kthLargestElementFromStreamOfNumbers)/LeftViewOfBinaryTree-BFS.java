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
	
	int[] leftView(Node root) {
	    // add your logic here
		Queue<Node> treeNodes = new LinkedList<Node> ();
		List<Integer> treeLeftView = new ArrayList<Integer> ();
		treeNodes.add(root);
		while (!treeNodes.isEmpty()) {
			int n = treeNodes.size();
			for (int i = 0; i < n; i++) {
				Node currentNode = treeNodes.peek();
				treeNodes.poll();
				if (i == 0) {
					treeLeftView.add(currentNode.data);
				}
				if (currentNode.left != null) {
					treeNodes.add(currentNode.left);
				}
				if (currentNode.right != null) {
					treeNodes.add(currentNode.right);
				}
			}
		}
		int[] temp = new int[treeLeftView.size()];
		for (int i = 0; i < treeLeftView.size(); i++) {
			temp[i] = treeLeftView.get(i);
		}
		return temp;
	}
}
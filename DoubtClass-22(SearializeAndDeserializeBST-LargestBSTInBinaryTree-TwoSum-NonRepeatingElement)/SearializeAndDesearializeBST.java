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

	String serialize(Node root) {
	    // add your logic here
		if(root == null) {
			return "#";
		}
		String left = serialize(root.left);
		String right = serialize(root.right);
		StringBuilder sb = new StringBuilder(root.data+" ");
		sb.append(left).append(" ").append(right);
		return sb.toString();
	}
	
	Node deserializeHelper(Queue<String> treeNodes) {
		String curr = treeNodes.poll();
		if(curr.equals("#")) {
			return null;
		}
		Node node = new Node(Integer.valueOf(curr));
		node.left = deserializeHelper(treeNodes);
		node.right = deserializeHelper(treeNodes);
		return node;
	}

	Node deserialize(String serializedString) {
	    // add your logic here
		Queue<String> treeNodes = new LinkedList<String>();
		treeNodes.addAll(Arrays.asList(serializedString.split(" ")));
		return deserializeHelper(treeNodes);
	}
}
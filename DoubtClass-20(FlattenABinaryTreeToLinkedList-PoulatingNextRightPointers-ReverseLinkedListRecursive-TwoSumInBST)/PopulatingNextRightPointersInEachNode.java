/* This is the Node class definition

class Node {
	public Node left;
    public Node right;
    public Node next;
    int data;

    Node(int data) {
        this.data = data;
    }
}
*/

class Solution {
	void connect(Node root) {
    	Queue<Node> treeNodes = new LinkedList<Node> ();
		treeNodes.add(root);
		while (!treeNodes.isEmpty()) {
			int n = treeNodes.size();
			for (int i = 0; i < n; i++) {
				Node currNode = treeNodes.peek();
				treeNodes.poll();
				if (i == n - 1) {
					currNode.next = null;
				} else {
					currNode.next = treeNodes.peek();
				}
				if (currNode.left != null) {
					treeNodes.add(currNode.left);
				}
				if (currNode.right != null) {
					treeNodes.add(currNode.right);
				}
			}
		}
		return;
	}
}
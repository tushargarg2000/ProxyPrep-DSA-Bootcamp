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
class BSTIterator {
	Stack<Node> treeNodes = new Stack<Node>();
	
	private void insertLeftNodes(Node root) {
		if(root == null) {
			return;
		}
		treeNodes.push(root);
		insertLeftNodes(root.left);
	}
	
    public BSTIterator(Node root) {
		insertLeftNodes(root);
    }
    
    public boolean hasNext() {
		return !treeNodes.isEmpty();
    }
    
    public Node next() {
		Node curr = treeNodes.pop();
		insertLeftNodes(curr.right);
		return curr;
    }
}
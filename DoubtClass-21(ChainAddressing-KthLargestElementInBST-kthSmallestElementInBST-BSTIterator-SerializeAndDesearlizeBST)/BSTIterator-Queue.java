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
	Queue<Node> treeNodes = new LinkedList<Node>();
	
	private void insertNodes(Node root) {
		if(root == null) {
			return;
		}
		insertNodes(root.left);
		treeNodes.add(root);
		insertNodes(root.right);
	}
	
    public BSTIterator(Node root) {
		insertNodes(root);
    }
    
    public boolean hasNext() {
		return !treeNodes.isEmpty();
    }
    
    public Node next() {
		Node curr = treeNodes.remove();
		return curr;
    }
}
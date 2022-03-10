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
	List<Node> treeNodes = new ArrayList<>();
	
	private void insertLeftNodes(Node root) {
		if(root == null) {
			return;
		}
		treeNodes.add(root);
		insertLeftNodes(root.left);
	}
	
    public BSTIterator(Node root) {
		insertLeftNodes(root);
    }
    
    public boolean hasNext() {
		return !treeNodes.isEmpty();
    }
    
    public Node next() {
		int n = treeNodes.size();
		Node curr = treeNodes.remove(n-1);
		insertLeftNodes(curr.right);
		return curr;
    }
}
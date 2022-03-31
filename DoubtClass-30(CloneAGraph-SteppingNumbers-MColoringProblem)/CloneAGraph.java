/* This is the Node class definition
class Node {
public
    int value = 0;
    ArrayList<Node> neighbors = new ArrayList<Node>();
    Node(int val) { value = val; }
};
*/

class Solution {
    Node cloneGraph(Node node) {
		HashMap<Integer, Node> visitedNodes = new HashMap<>();
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		Node newRoot = new Node(node.value);
		visitedNodes.put(node.value, newRoot);
		while(!queue.isEmpty()) {
			Node currNode = queue.poll();
			Node copyNode = visitedNodes.get(currNode.value);
			for(int i=0;i<currNode.neighbors.size();i++) {
				int key = currNode.neighbors.get(i).value;
				if(visitedNodes.containsKey(key)) {
					copyNode.neighbors.add(visitedNodes.get(key));
				}
				else {
					Node newChild = new Node(key);
					visitedNodes.put(key, newChild);
					queue.add(newChild);
					copyNode.neighbors.add(newChild);
				}
			}
		}
		return newRoot;
    }
}
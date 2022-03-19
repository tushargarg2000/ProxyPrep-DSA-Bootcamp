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
	class Pair {
		Node first;
		int second;
		Pair (Node x, int y) {
			first = x;
			second = y;
		}
	}
	int[] topView(Node root) {
	    Queue<Pair> treeNodes = new LinkedList<>();
		HashMap<Integer, Integer> visitedDistance = new HashMap<>();
		List<Integer> leftNodes = new ArrayList<> ();
		List<Integer> rightNodes = new ArrayList<> ();
		treeNodes.add(new Pair(root, 0));
		while (!treeNodes.isEmpty()) {
			Node currentNode = treeNodes.peek().first;
			int distance = treeNodes.peek().second;
			treeNodes.poll();
			if (visitedDistance.get(distance) == null) {
				if (distance < 0) {
					leftNodes.add(currentNode.data);
				} else {
					rightNodes.add(currentNode.data);
				}
				visitedDistance.put(distance, 1);
			}
			if (currentNode.left != null) {
				treeNodes.add(new Pair(currentNode.left, distance - 1));
			}
			if (currentNode.right != null) {
				treeNodes.add(new Pair(currentNode.right, distance + 1));
			}
		}
		int[] treeTopView = new int[leftNodes.size() + rightNodes.size()];
		int indx = 0;
		for (int i = leftNodes.size() - 1; i >= 0; i--) {
			treeTopView[indx++] = leftNodes.get(i);
		}
		for (int i = 0; i < rightNodes.size(); i++) {
			treeTopView[indx++] = rightNodes.get(i);
		}
		return treeTopView;
	}
}
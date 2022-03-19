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
        int first;
        int second;
        
        Pair(int x, int y)
        {
            first = x;
            second = y;
        }
    }
	void getTopView(Node root, int distance, int depth, TreeMap <Integer,Pair> treeTopView)
    { 
        if(root == null) {
        	return; 
		}
        if(!treeTopView.containsKey(distance)) {
            treeTopView.put(distance, new Pair(root.data, depth)); 
		}
		else if(treeTopView.get(distance).second > depth) {
            treeTopView.put(distance, new Pair(root.data, depth));
		}
        getTopView(root.left, distance - 1, depth + 1, treeTopView);
        getTopView(root.right, distance + 1, depth + 1, treeTopView); 
    } 
	int[] topView(Node root) {
		TreeMap<Integer,Pair> treeTopView = new TreeMap<>();
		getTopView (root, 0, 0, treeTopView); 
		int[] view = new int[treeTopView.size()];
		int indx = 0;
		for (Map.Entry<Integer, Pair> i: treeTopView.entrySet()) {
            view[indx++] = i.getValue().first;
	    }
		return view; 
	}
}
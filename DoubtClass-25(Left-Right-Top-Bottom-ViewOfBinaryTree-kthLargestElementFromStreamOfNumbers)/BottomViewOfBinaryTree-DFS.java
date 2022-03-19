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
	void getBottomView(Node root, int distance, int depth, TreeMap <Integer,Pair> treeBottomView)
    { 
        if(root == null) {
        	return; 
		}
        if(!treeBottomView.containsKey(distance)) {
            treeBottomView.put(distance, new Pair(root.data, depth)); 
		}
		else if(treeBottomView.get(distance).second <= depth) {
            treeBottomView.put(distance, new Pair(root.data, depth));
		}
        getBottomView(root.left, distance - 1, depth + 1, treeBottomView);
        getBottomView(root.right, distance + 1, depth + 1, treeBottomView); 
    } 
	int[] bottomView(Node root) {
	    TreeMap<Integer,Pair> treeBottomView = new TreeMap<>();
		getBottomView (root, 0, 0, treeBottomView); 
		int[] view = new int[treeBottomView.size()];
		int indx = 0;
		for (Map.Entry<Integer, Pair> i: treeBottomView.entrySet()) {
            view[indx++] = i.getValue().first;
	    }
		return view;
	}
}
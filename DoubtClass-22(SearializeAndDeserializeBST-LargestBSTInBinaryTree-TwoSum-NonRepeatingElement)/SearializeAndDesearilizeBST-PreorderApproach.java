class Index {
 
    int index = 0;
}
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
	
	 Index index = new Index();
	
	void preorder(Node root, ArrayList<Integer> arr) {
		if(root == null) {
			return;
		}
		arr.add(root.data);
		preorder(root.left, arr);
		preorder(root.right, arr);
	}

	String serialize(Node root) {
	    // add your logic here
		ArrayList<Integer> arr = new ArrayList<Integer>();
		preorder(root, arr);
		StringBuilder sb = new StringBuilder("");
		for(int x : arr) {
			sb.append(x + "");
			sb.append(" ");
		}
		return sb.toString().trim();
	}
	
	Node constructTree(int pre[], Index preIndex,int low, int high, int size)
    {
        if (preIndex.index >= size || low > high) {
            return null;
        }
        Node root = new Node(pre[preIndex.index]);
        preIndex.index = preIndex.index + 1;
        if (low == high) {
            return root;
        }
        int i;
        for (i = low; i <= high; ++i) {
            if (pre[i] > root.data) {
                break;
            }
        }
        root.left = constructTree(pre, preIndex, preIndex.index, i - 1, size);
        root.right = constructTree(pre, preIndex, i,high, size);
        return root;
    }

	Node deserialize(String serializedString) {
	    // add your logic here
		ArrayList<String> treeNodes = new ArrayList<String>();
		treeNodes.addAll(Arrays.asList(serializedString.split(" ")));
		int[] pre = new int[treeNodes.size()];
		for(int i=0;i<treeNodes.size();i++) {
			pre[i] = Integer.parseInt(treeNodes.get(i));
		}
		index.index = 0;
		return constructTree(pre, index, 0, treeNodes.size()-1, treeNodes.size());
	}
}
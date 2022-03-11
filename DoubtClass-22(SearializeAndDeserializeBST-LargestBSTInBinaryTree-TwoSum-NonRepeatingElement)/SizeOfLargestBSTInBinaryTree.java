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
	class Val {
		int size = 0; 
		boolean flag = false;
		int minimum = Integer.MAX_VALUE; 
		int maximum = Integer.MIN_VALUE;
	}
	void largestBstSize(Node root, Val maxVal, Val minVal, Val bstSize, Val isBst) {
		if (root == null) {
			isBst.flag = true;
			return;
		}
		Val isLeftBst = new Val(), isRightBst = new Val();
		Val leftSize = new Val(), rightSize = new Val();
		Val leftMaxVal = new Val(), leftMinVal = new Val(), rightMaxVal = new Val(), rightMinVal = new Val();
		largestBstSize(root.left, leftMaxVal, leftMinVal, leftSize, isLeftBst);
		largestBstSize(root.right, rightMaxVal, rightMinVal, rightSize, isRightBst);
		maxVal.maximum = Math.max(root.data, Math.max(leftMaxVal.maximum, rightMaxVal.maximum));
		minVal.minimum = Math.min(root.data, Math.min(leftMinVal.minimum, rightMinVal.minimum));
		if (isLeftBst.flag && isRightBst.flag && leftMaxVal.maximum < root.data && rightMinVal.minimum > root.data) {
			isBst.flag = true;
			bstSize.size = 1 + leftSize.size + rightSize.size;
		} else {
			bstSize.size = Math.max(leftSize.size, rightSize.size);
		}
		return;
	}
	int getLargestBstSize(Node root) {
		Val maxVal = new Val(), minVal = new Val();
		Val bstSize = new Val(), isBst = new Val();
		largestBstSize(root, maxVal, minVal, bstSize, isBst);
		return bstSize.size;
	}
}
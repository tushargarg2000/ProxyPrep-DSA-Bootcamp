/* This is the Node class definition

class Node {
	public Node left;
    public Node right;
    int data;

    Node(int data) {
        this.data = data;
    }
}
*/

class Solution {
	int ans;
	int getDiameter(Node root) {
    	// add your logic here
		ans = 0;
		getDiameterHelper(root);
		return ans;
	}
	int getDiameterHelper(Node root) {
		if(root == null) {
			return 0;
		}		
		int val1 = getDiameterHelper(root.left);
		int val2 = getDiameterHelper(root.right);
		int val = val1 + val2;
		ans = Math.max(ans,val);
		return 1 + Math.max(val1, val2);
	}
}
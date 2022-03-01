class Pair{
	int height;
	int diameter;
}

class TreeCode{
	
	static int diameter;
	int height(Node root){
		if(root==null)
			return 0;
		
		int leftHeight = height(root.left);
		
		int rightHeight = height(root.right);
		
		
		diameter = Math.max(leftHeight+rightHeight,diameter);
		
		return Math.max(leftHeight,rightHeight)+1;

	}
	
	Pair fastDiameter(Node root){
		
		if(root==null){
			
			Pair p = new Pair();
			p.height = 0;
			p.diameter = 0;
			return p;
			
		}	
		Pair left = fastDiameter(root.left);
		Pair right = fastDiameter(root.right);
		
		
		Pair p = new Pair();
		
		p.height = Math.max(left.height,right.height)+1;
		
		
		int op1 = left.height + right.height;
		
		int op2 = left.diameter;
		int op3 = right.diameter;
		
		p.diameter = Math.max(op1,Math.max(op2,op3));
		
		return p;
	}
	
		
	int diameterLength(Node root){
		
		
		if(root==null)
			return 0;
		
		
		int op1 = height(root.left) + height(root.right);
		
		int op2 = diameterLength(root.left);
		
		int op3 = diameterLength(root.right);
		
		return Math.max(op1,Math.max(op2,op3));
	}
}
class Solution {
	int getDiameter(Node root) {
    	// add your logic here
		
		TreeCode tree = new TreeCode();
		Pair p = new Pair();
		
		p = tree.fastDiameter(root);
		return p.diameter;		
	}
}
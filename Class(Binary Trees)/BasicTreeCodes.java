class TreeCode{
	
	int diaMeter(Node root){
		
	}
	int findHeight(Node root){
		
		if(root==null){
			return 0;
		}
		
		int leftHeight = findHeight(root.left);
		
		int rightHeight = findHeight(root.right);
		
		int maxHeight = Math.max(leftHeight,rightHeight);
		
		return 1+maxHeight;
	}
	
	
	
	int countNoOfLeafNodes(Node root){
		
		if(root.left==null&&root.right==null){
			return 1;
		}
		
		int leftCount = countNoOfLeafNodes(root.left);
		int rightCount = countNoOfleafNodes(root.right);
		
		int totalCount = leftCount+rightCount;
		
		return totalCount;
		
	}
	int countNoOfNodes(Node root){
		
		if(root==null)
			return 0;
		
		int leftCount = countNoOfNodes(root.left);
		
		int rightCount = countNoOfNodes(root.right);
		
		
		int totalCount = leftCount+rightCount+1;
		
		return totalCount;
		
	}
	
}
class Solution {
	
	List<Integer> getPreorderTraversal(Node root) {
    	// add your logic here
		
		List<Integer> li = new ArrayList<>();
		
		//li.add(1);
		
		TreeCode tree = new TreeCode();
		
		int nodes = tree.countNoOfNodes(root);
		
		System.out.println(nodes);
		
		return li;
		
		
	}
}




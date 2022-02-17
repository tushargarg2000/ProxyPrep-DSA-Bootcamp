class Solution {
	int[] getNextGreaterElement (int[] A) {
		
		Stack<Integer> stack = new Stack<>();
		
		
		int result[] = new int[A.length];
		
		stack.push(0);
		
		int n = A.length;
		for(int i=1;i<n;i++){
			
			int value = A[i];
			while(!stack.empty() && A[stack.peek()]<value){
				result[stack.peek()] = value;
				stack.pop();
			}
			stack.push(i);
		}
		while(!stack.empty()){
			
			int index = stack.peek();
			result[index] = -1;
			stack.pop();
		}
		return result;
		
		//return result;
	}
}

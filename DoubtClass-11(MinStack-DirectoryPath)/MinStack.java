// Implement the below class
class MinStack {
	Stack<Integer> stack = new Stack<>();
    void push(int x) {
		if(stack.empty()) {
			stack.push(x);
			stack.push(x);
			return;
		}
		int min = stack.peek();
		stack.push(x);
		stack.push(Math.min(x,min));
    }
    void pop() {
		if(stack.empty()) {
			return;
		}
	    stack.pop();
		stack.pop();
    }
    int top() {
		if(stack.empty()) {
			return -1;
		}
	    int min = stack.peek();
		stack.pop();
		int top = stack.peek();
		stack.push(min);
		return top;
    }
    int getMin() {
		if(stack.empty()) {
			return -1;
		}
	    return stack.peek();
    }
}

/*
	// MinStack class and its object will be used as given below:
	MinStack minStack = new MinStack();
	minStack.push(42);
	int top = minStack.top();
	int min = minStack.getMin();
	minStack.pop();
*/
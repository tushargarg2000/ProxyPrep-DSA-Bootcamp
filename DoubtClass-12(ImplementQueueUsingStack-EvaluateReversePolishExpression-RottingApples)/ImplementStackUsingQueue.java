/* Use this Queue class
class Queue {
	Queue (int capacity)
	int size()
	boolean isEmpty()
	int front()
	int back()
	void push(int element)
	void pop()
};
*/

// Implement the Stack class
class Stack {
	
	Queue queue;
	int size,capacity;
	
	public Stack (int capacity) {
		this.capacity = capacity;
		size = 0;
		queue = new Queue(capacity);
	}

	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return size;
	}
	
	public int top() {
		if(isEmpty()) {
			return -1;
		}
		return queue.front();
	}
	
	public void push(int element) {
		size++;
		queue.push(element);
		for(int i = 1; i < queue.size(); i++) {
			queue.push(queue.front());
			queue.pop();
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			size--;
			queue.pop();
		}
	}
}
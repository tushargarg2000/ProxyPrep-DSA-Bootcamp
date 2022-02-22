class Solution {
	int[] maxSlidingWindow(int[] A, int k) {
	    // add your logic here
		Deque<Integer> deque = new LinkedList<Integer>();
		for(int i=0;i<k;i++) {
			while(!deque.isEmpty() && A[i] >= A[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.addLast(i);
		}
		int n = A.length;
		int ans[] = new int[n-k+1];
		for(int i=k;i<n;i++) {
			ans[i-k] = A[deque.peek()];
			while(!deque.isEmpty() && deque.peek() <= i-k) {
				deque.removeFirst();
			}
			while(!deque.isEmpty() && A[i] >= A[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.addLast(i);
		}
		ans[n-k] = A[deque.peek()];
		return ans;
	}
}
class KthLargest {
    /** initialize your data structure here. */
	PriorityQueue<Integer> pq;
	int k;
    public KthLargest(int k) {
		pq = new PriorityQueue<>();
		this.k = k;
    }
    
    public int add(int num) {
		pq.add(num);
		if(pq.size() < k) {
			return -1;
		}
		while(pq.size() > k) {
			pq.poll();
		}
		return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k);
 * int value = obj.add(num);
 */
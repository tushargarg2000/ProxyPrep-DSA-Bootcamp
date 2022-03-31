class Solution {
	List<Integer> getSteppingNumbers(int begin, int end) {
    	int initialValue[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		List<Integer> answer = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= 9; i++) {
			q.add(i);
		}
		if(begin == 0) {
			answer.add(begin);
		}
		while(!q.isEmpty()) {
			int node = q.poll();
			if(node >= begin && node <= end) {
				answer.add(node);
			}
			int child, lastDigit = node % 10;
			node *= 10;
			if(lastDigit != 0) {
				child = node + lastDigit - 1;
				if(child <= end) {
					q.add(child);
				}
			}
			if(lastDigit != 9) {
				child = node + lastDigit + 1;
				if(child <= end) {
					q.add(child);
				}
			}
		}
		return answer;
	}
}

class Solution {
	ArrayList<Integer> possibleList;
	boolean isPossible;
	void solve(char c[],int start,int n){
		if(start == n) {
			for(int i = 1; i < possibleList.size(); i++) {
				if(possibleList.get(i - 1) - 1 == possibleList.get(i)) {
					continue;
				}
				isPossible = false;
				return;
			}
			if(possibleList.size() != 1) {
				isPossible = true;
			}
			return;
		}
		
		int num = 0;
		for(int i = start; i < n; i++){
			num = num * 10 + (c[i] - '0');
			possibleList.add(num);
			solve(c, i + 1, n);
			if(isPossible == true){
				return;
			}
			possibleList.remove(possibleList.size() - 1);
		}
	}
	boolean isConsecutivelyDescending(String s) {
		possibleList = new ArrayList<>();
		isPossible = false;
		solve(s.toCharArray(), 0, s.length());
		return isPossible;
	}
}
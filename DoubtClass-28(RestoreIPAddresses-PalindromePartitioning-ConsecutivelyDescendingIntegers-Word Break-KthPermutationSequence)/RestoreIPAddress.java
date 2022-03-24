class Solution {
	List<String> address;
	ArrayList<Integer> numberList;
	List<String> restoreIPAddresses(String s) {
		address = new ArrayList<>();
		numberList = new ArrayList<>();
		solve(s.toCharArray(), 0, s.length());
		return address;
	}
	void solve(char c[], int start, int n){
		if(start == n) {
			int flag = 1;
			if(numberList.size() != 4) {
				return;
			}
			for(int i: numberList) {
				if(i >= 0 && i <= 255) {
					continue;
				}
				flag = 0;
				break;
			}
			
			if(flag == 1){
				String auxiliary = "";
				for(int i: numberList) {
					auxiliary += i + ".";
				}
				if(auxiliary.length() == n + 4)
					address.add(auxiliary.substring(0, auxiliary.length() - 1));
			}
			return;
		}
		
		int num = 0;
		for(int i = start; i < n; i++) {
			num = num * 10 + (c[i] - '0');
			numberList.add(num);
			solve(c, i + 1, n);
			numberList.remove(numberList.size() - 1);
		}
	}
}
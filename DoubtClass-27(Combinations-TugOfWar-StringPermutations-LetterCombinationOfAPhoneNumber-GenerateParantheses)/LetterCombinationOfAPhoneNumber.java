class Solution {
	ArrayList<ArrayList<Character>> charSet;
	List<String> result;
	ArrayList<Character> characterList = new ArrayList<>();
	void solve(String digits,int idx,int n){
		if(idx == n){
			String auxiliary = "";
			for(char i: characterList){
				auxiliary += i;
			}
			if(auxiliary.length() == digits.length()) {
				result.add(auxiliary);
			}
			return;
		}
		for(int i = idx; i < n; i++){
			for(char ch: charSet.get(digits.charAt(i) - '0')){
				characterList.add(ch);
				solve(digits, i + 1, n);
				characterList.remove(characterList.size() - 1);
			}
		}
	}
	List<String> letterCombinations(String digits) {
		result = new ArrayList<>();
		charSet = new ArrayList<>();
		int n = digits.length();
		for(int i = 0; i <= 9; i++) {
			charSet.add(new ArrayList<>());
		}
		char ch = 'a';
		for(int i = 2; i <= 9; i++) {
			if(i != 7 && i != 9)
			for(int j = 0; j < 3; j++) {
				charSet.get(i).add(ch);
				ch++;
			}
			else{
				for(int j = 0;j < 4; j++){
					charSet.get(i).add(ch);
					ch++;
				}		
			}
		}
		solve(digits, 0, n);
		return result;
	}
}
vector<vector<char>> charSet;
vector<string> result;
vector<char> characterList;
void solve(string digits,int idx,int n){
	if(idx == n){
		string auxiliary = "";
		for(char i: characterList){
			auxiliary += i;
		}
		if(auxiliary.length() == digits.length()) {
			result.push_back(auxiliary);
		}
		return;
	}
	for(int i = idx; i < n; i++){
		for(char ch: charSet[digits[i] - '0']){
			characterList.push_back(ch);
			solve(digits, i + 1, n);
			characterList.pop_back();
		}
	}
}
vector<string> letterCombinations(string digits) {
	result.clear();
	charSet.clear();
	int n = digits.length();
	for(int i = 0; i <= 9; i++) {
		vector<char> temp;
		charSet.push_back(temp);
	}
	char ch = 'a';
	for(int i = 2; i <= 9; i++) {
		if(i != 7 && i != 9)
		for(int j = 0; j < 3; j++) {
			charSet[i].push_back(ch);
			ch++;
		}
		else{
			for(int j = 0;j < 4; j++){
				charSet[i].push_back(ch);
				ch++;
			}		
		}
	}
	solve(digits, 0, n);
	return result;
}
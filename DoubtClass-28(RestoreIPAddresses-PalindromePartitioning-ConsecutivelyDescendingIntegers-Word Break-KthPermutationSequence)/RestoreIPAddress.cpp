vector<string> address;
vector<int> numberList;
void solve(string c, int start, int n){
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
			string auxiliary = "";
			for(int i: numberList) {
				auxiliary += (to_string(i) + ".");
			}
			if(auxiliary.length() == n + 4) {
				address.push_back(auxiliary.substr(0, auxiliary.length()-1));
			}
		}
		return;
	}

	int num = 0;
	for(int i = start; i < n; i++) {
		num = num * 10 + (c[i] - '0');
		numberList.push_back(num);
		solve(c, i + 1, n);
		numberList.pop_back();
	}
}
vector<string> restoreIPAddresses(string s) {
    address.clear();
	numberList.clear();
	solve(s, 0, s.length());
	return address;
}
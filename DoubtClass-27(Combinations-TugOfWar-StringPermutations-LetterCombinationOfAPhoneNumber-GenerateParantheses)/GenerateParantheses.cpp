vector<string> ans;
void generateParenthesesHelper(int open,int close,int n,string& s) {
	if(open == close) {
		if(n == 0) {
			ans.push_back(s);
		}
		else {
			s += "(";
			generateParenthesesHelper(open+1,close,n-1,s);
			s.pop_back();
		}
	}
	else {
		if(n == 0) {
			s += ")";
			generateParenthesesHelper(open,close+1,n,s);
			s.pop_back();
		}
		else {
			s += "(";
			generateParenthesesHelper(open+1,close,n-1,s);
			s.pop_back();
			s += ")";
			generateParenthesesHelper(open,close+1,n,s);
			s.pop_back();
		}
	}
}
vector<string> generateParentheses(int n) {
    // add your logic here
	string s = "";
	ans.clear();
	generateParenthesesHelper(0,0,n,s);
	return ans;
}
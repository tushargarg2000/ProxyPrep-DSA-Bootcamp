vector<int> getSteppingNumbers(int begin, int end) {
    // add your logic here
	vector<int> answer;
	queue<int> q;
	for(int i=1;i<=9;i++) {
		q.push(i);
	}
	if(begin == 0) {
		answer.push_back(0);
	}
	while(!q.empty()) {
		int num = q.front();
		q.pop();
		if(num >= begin && num <= end) {
			answer.push_back(num);
		}
		int lastDigit = num%10;
		if(lastDigit != 0) {
			int child = num*10 + (lastDigit-1);
			if(child <= end) {
				q.push(child);
			}
		}
		if(lastDigit != 9) {
			int child = num*10 + (lastDigit+1);
			if(child <= end) {
				q.push(child);
			}
		}
	}
	return answer;
}
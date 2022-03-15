int longestSubstringWithKUniqueCharacters(string s, int k) {
    int n = s.length();
	int hashChar[n][26];
	memset(hashChar, 0, sizeof(hashChar));
	unordered_set<char> distinct(s.begin(), s.end());
	for(int i = 0; i < n; i++) {
		hashChar[i][s[i] - 'a']++;
	}
	for(int i = 1; i < n; i++) {
		for(int j = 0; j < 26; j++) {
			hashChar[i][j] += hashChar[i - 1][j];
		}
	}
	auto query = [&] (int l, int r) {
		int cnt = 0;
		for(int i = 0; i < 26; i++) {
			if(l == 0) {
				cnt += hashChar[r][i] > 0;
			}
			else {
				cnt += (hashChar[r][i] - hashChar[l - 1][i]) > 0;
			}
		}
		return cnt;
	};
	if(distinct.size() < k) {
		return -1;
	}
	else {
		int answer = 0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int unique = query(i,j);
				if(unique == k) {
					answer = max(answer, j-i+1);
				}
			}
		}
		return answer;
	}
}
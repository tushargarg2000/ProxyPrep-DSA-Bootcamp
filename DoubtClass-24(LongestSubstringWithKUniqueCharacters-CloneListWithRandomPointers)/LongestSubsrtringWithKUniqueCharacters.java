class Solution {
	int hashChar[][];
	int query(int l, int r) {
		int cnt = 0;
		for(int i = 0; i < 26; i++) {
			if(l == 0) {
				cnt += (hashChar[r][i] > 0 ? 1 : 0);
			}
			else {
				cnt += ((hashChar[r][i] - hashChar[l - 1][i]) > 0 ? 1 : 0);
			}
		}
		return cnt;
	}
	int longestSubstringWithKUniqueCharacters(String s, int k) {
	    int n = s.length();
		hashChar = new int[n][26];
		int distinct = 0;
		int count[] = new int[26];
		for(int i = 0; i < n; i++) {
			count[s.charAt(i) - 'a']++;
		}
		for(int i = 0; i < 26; i++) {
			distinct += (count[i] > 0 ? 1 : 0);
		}
		for(int i = 0; i < n; i++) {
			hashChar[i][s.charAt(i) - 'a']++;
		}
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < 26; j++) {
				hashChar[i][j] += hashChar[i - 1][j];
			}
		}
		if(distinct < k) {
			return -1;
		}
		else {
			int left = 0, right = 0, answer = 0;
			while(right < n && left <= right) {
				if(query(left, right) <= k) {
					if(query(left, right) == k) {
						answer = Math.max(answer, right - left + 1);
					}
					right++;
				}
				else {
					left++;
				}
			}
			return answer;
		}
	}
}

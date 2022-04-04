class Solution {
	String lps(String str) {
	    // add your logic here
		int n = str.length();
		int start = 0;
		int len = 1;
		boolean isPal[][] = new boolean[n][n];
		for(int i=0;i<n;i++) {
			isPal[i][i] = true;
		}
		for(int i=0;i<n-1;i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				isPal[i][i+1] = true;
				if(len < 2) {
					len = 2;
					start = i;
				}
			}
		}
		for(int i=n-3;i>=0;i--) {
			for(int j=i+2;j<n;j++) {
				if(str.charAt(i) == str.charAt(j) && isPal[i+1][j-1]) {
					isPal[i][j] = true;
					if(len <= j-i+1) {
						len = j-i+1;
						start = i;
					}
				}
			}
		}
		return str.substring(start, start+len);
	}
}
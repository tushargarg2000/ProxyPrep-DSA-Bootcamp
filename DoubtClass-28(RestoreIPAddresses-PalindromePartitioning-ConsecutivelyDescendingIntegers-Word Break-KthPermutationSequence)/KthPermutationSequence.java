class Solution {
	long getFactorial(int n) {
		long factorial = 1;
		for(int i = 2; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	String getKthPermutation(int n, int k) {
	    StringBuilder result = new StringBuilder();
		StringBuilder auxiliary = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			auxiliary.append((char)(i + '0'));
		}
		long length = getFactorial(n);
		k--;
		while(auxiliary.length() > 0) {
			length /= n;
			long index = k / length;
			k %= length;
			result.append(auxiliary.charAt((int)index));
			auxiliary.delete((int)index, (int)index + 1);
			n--;
		}
		return new String(result);
	}
}

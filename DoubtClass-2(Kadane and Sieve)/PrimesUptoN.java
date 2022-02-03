class Solution {
	List<Integer> primesUptoN(int n) {
		// sieve algorithm - O(N*log(logN))
		List<Integer> ans = new ArrayList<>();
		boolean prime[] = new boolean[n+1]; // all values are false here
		for(int i=2;i<=n;i++) {
			prime[i] = true; // assume all numbers are prime
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]) { // i is prime
				for(int j=2;j*i<=n;j++) {
					prime[i*j] = false; // all multiples of i are not prime
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]) {
				ans.add(i);
			}
		}
		return ans;
		// O(N^2)
		// List<Integer> ans = new ArrayList<>();
		// for(int i=1;i<=n;i++) {
		// 	if(isPrime(i)) {
		// 		ans.add(i);
		// 	}
		// }
		// return ans;
		// O(N*sqrt(N))
		// List<Integer> ans = new ArrayList<>();
		// for(int i=1;i<=n;i++) {
		// 	if(isPrime2(i)) {
		// 		ans.add(i);
		// 	}
		// }
		// return ans;
	}
	private boolean isPrime(int num) {
		int divisors = 0;
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				divisors++;
			}
		}
		if(divisors == 2) {
			return true;
		}
		return false;
	}
	private boolean isPrime2(int num) {
		int divisors = 0;
		for(int i=1;i*i<=num;i++) {
			if(num%i == 0) {
				divisors++;
				if(i != num/i) {
					divisors++;
				}
			}
		}
		if(divisors == 2) {
			return true;
		}
		return false;
	}
}
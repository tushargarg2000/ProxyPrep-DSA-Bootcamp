class Solution {
	List<Integer> getEvenDigitNumbers (int[] arr) {
		// add your logic here
		List<Integer> ans = new ArrayList<>();
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int num = arr[i];
			int len = 0;
			while(num>0) {
				len++;
				num /= 10;
			}
			if(arr[i] == 0)
				len++;
			if(len%2 == 0)
				ans.add(arr[i]);
		}
		return ans;
	}
}

// int n = 0;
// int len = 0;
// while(n > 0) {
// 	len++;
// 	n = n/10;
// }
// System.out.println(len); // 0
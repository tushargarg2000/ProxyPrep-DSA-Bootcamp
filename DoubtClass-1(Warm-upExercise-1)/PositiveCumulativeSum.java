class Solution {
	List<Integer> getPositiveCumulativeSum (int[] arr) {
		// add your logic here
// 		int n = arr.length;
// 		for(int i=1;i<n;i++) 
// 			arr[i] += arr[i-1];
		
// 		List<Integer> ans = new ArrayList<>();
		
// 		for(int i=0;i<n;i++) {
// 			if(arr[i] > 0)
// 				ans.add(arr[i]);
// 		}
// 		return ans;
		int n = arr.length;
		int p[] = new int[n];
		p[0] = arr[0];
		for(int i=1;i<n;i++) {
			p[i] = arr[i] + p[i-1];
		}
		
		// p -> cumulative sum
		
		List<Integer> ans = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			if(p[i] > 0) {
				ans.add(p[i]);
			}
		}
		
		return ans;
	}
}
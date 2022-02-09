class Solution {
	int searchRoot (int num) {
		// add your logic here
		int ans = 0;
		int low = 1;
		int high = num;
		while(low <= high) {
			int mid = (low + high)/2;
			if(mid > num/mid) {
				high = mid-1;
			}
			else {
				ans = mid;
				low = mid+1;
			}
		}
		return ans;
	}
}
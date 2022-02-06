class Solution {
	int[][] mergeIntervals(int[][] intervals) {
	    // add your logic here
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0])); // sort 2d array
		// int index = 0;
		// for(int i=1;i<intervals.length;i++) {
		// 	if(intervals[index][1] >= intervals[i][0]) {
		// 		intervals[index][1] = Math.max(intervals[index][1],intervals[i][1]);
		// 	}
		// 	else {
		// 		index++;
		// 		intervals[index][1] = intervals[i][1];
		// 		intervals[index][0] = intervals[i][0];
		// 	}
		// }
		// int ans[][] = new int[index+1][2];
		// for(int i=0;i<=index;i++) {
		// 	ans[i][0] = intervals[i][0];
		// 	ans[i][1] = intervals[i][1];
		// }
		// return ans;
		
		
	// intervals[i][0] -> start of the interval and intervals[i][1] -> end of the interval
		
		int index = 0;
		int n = intervals.length;
		for(int i=1;i<n;i++) {
			if(intervals[index][1] >= intervals[i][0]) {
				intervals[index][1] = Math.max(intervals[index][1],intervals[i][1]);
			}
			else {
				index++;
				intervals[index][1] = intervals[i][1];
				intervals[index][0] = intervals[i][0];
			}
		}
		int ans[][] = new int[index+1][2];
		for(int i=0;i<=index;i++) {
			ans[i][0] = intervals[i][0];
			ans[i][1] = intervals[i][1];
		}
		return ans;
	}
}
class Solution {
	int volumeOfTrappedRainWater(int[] heights) {
	    int n = heights.length;
		int totalRainWater = 0;
		for (int i = 0; i < n; i++){
			int maxLeft = 0, maxRight = 0;
			for (int j = 0; j <= i; j++){
				maxLeft = Math.max (maxLeft, heights[j]);
			}
			for (int j = i; j < n; j++) {
				maxRight = Math.max (maxRight, heights[j]);
			}
			totalRainWater += Math.min (maxRight, maxLeft) - heights[i];
		}
		return totalRainWater;
	}
}

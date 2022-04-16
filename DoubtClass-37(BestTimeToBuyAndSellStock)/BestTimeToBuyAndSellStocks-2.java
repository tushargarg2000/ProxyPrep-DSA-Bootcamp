class Solution {
	int maxProfit(int[] prices) {
        int maximumProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maximumProfit += prices[i] - prices[i - 1];
        }
        return maximumProfit;
	}
}
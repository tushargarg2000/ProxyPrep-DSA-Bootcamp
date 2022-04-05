/* This is the JewelStone class definition
class JewelStone {
    int weight, value;
    JewelStone(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}
*/
class Solution {
   int dp[][];
   int knapSack(JewelStone[] stones, int capacity, int n) {
       if(n == 0 || capacity == 0) {
           return 0;
       }
       if(dp[n][capacity] != -1) {
           return dp[n][capacity];
       }
       if(stones[n - 1].weight > capacity) {
           return dp[n][capacity] = knapSack(stones, capacity, n - 1);
       }
       return dp[n][capacity] = Math.max(stones[n - 1].value + knapSack(stones, capacity - stones[n - 1].weight, n - 1), knapSack(stones, capacity, n - 1));
     }
   int getMaxValue (JewelStone[] stones, int capacity) {
       dp = new int[stones.length + 1][capacity + 1];
       for(int i = 0; i <= stones.length; i++) {
           Arrays.fill(dp[i], -1);
       }
       return knapSack(stones, capacity, stones.length);
   }
}
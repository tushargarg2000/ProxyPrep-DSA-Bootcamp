public class Solution {
    public int solve(int[] A, int B) {
        int l = 0;
        int r = 0;
        int sum = A[0];
        int ans = 0;
        int n = A.length;
        while(l < n && r < n) {
            if(sum < B) {
                r++;
                if(r > l) {
                    ans += (r-l);
                }
                if(r < n) {
                    sum += A[r];
                }
            }
            else {
                sum -= A[l];
                l++;
            }
        }
        return ans;
    }
}

public class Solution {
    public int[] maxone(int[] A, int B) {
        int n = A.length;
        List<Integer> v = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(A[i] == 0) {
                v.add(i);
            }
        }
        if(v.size() <= B) {
            int ans[] = new int[n];
            for(int i=0;i<n;i++) {
                ans[i] = i;
            }
            return ans;
        }
        int l = 0;
        int r = v.get(B)-1;
        v.add(n);
        for(int i=B+1;i<v.size();i++) {
            int l1 = v.get(i-B-1)+1;
            int r1 = v.get(i)-1;
            if(r1-l1>r-l)
            {
                r = r1;
                l = l1;
            }
        }
        int ans[] = new int[r-l+1];
        for(int i=l;i<=r;i++) {
            ans[i-l] = i;
        }
        return ans;
    }
}

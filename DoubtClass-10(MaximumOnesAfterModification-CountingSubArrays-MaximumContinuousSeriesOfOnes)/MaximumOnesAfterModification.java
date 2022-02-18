public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int l = 0;
        int ans = 0;
        int k = 0;
        for(int i=0;i<n;i++) {
            if(A[i] == 0) {
                k++;
            }
            while(k > B) {
                if(A[l] == 0) {
                    k--;
                }
                l++;
            }
            ans = Math.max(ans,i-l+1);
        }
        return ans;
    }
}

/*

int l1 = -1,r1=-1;

if(i-l+1 > ans) {
    l1 = l;
    r1 = i;
}


for(int i=l1;i<=r1;i++) {
    if(A[i] == 0) {
        ans.add(i);
    }
}

return ans;





*/


 class Solution{
    static boolean canPaint(int[] arr,long time,int k){
            
        int painter = 1;
        int n = arr.length;
            
        long sum = 0;
        for(int i=0;i<n;i++){
            
            sum = sum+arr[i];
            if(sum>time){
                painter++;
                sum = arr[i];
            }
        }
        
        if(painter<=k)
            return true;
        else
            return false;
        
    }
    static long minTime(int[] arr,int n,int k){
        
        long mini = 0;
        long maxi = 0;
        
        for(int i = 0;i<n;i++){
            mini = Math.max(mini,arr[i]);
            maxi = maxi + arr[i];
        }
        long s = mini;
        long e = maxi;
        long ans = -1;
        
        while(s<=e){
            
            long mid = (s+e)/2;
            if(canPaint(arr,mid,k)==true){
                ans = mid;
                e = mid-1; //why ?
            }
            else
                s = mid+1;
        }
        return ans;
    }
}
class Solution {
   int getIdenticalTwinsCount (int[] arr) {
       int ans = 0; // count
	   int n = arr.length; // size of array
	   for(int i=0;i<n;i++) {
		   for(int j=i+1;j<n;j++) {
				if(arr[i] == arr[j])
					ans++; // count++
		   }
	   }
	   return ans;
   }
}
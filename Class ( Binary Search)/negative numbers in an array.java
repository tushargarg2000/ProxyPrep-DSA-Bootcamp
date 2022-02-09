class Solution {
	int getNegativeNumbersCount (int[] arr) {
		// add your logic here
		
		int s = 0,e = arr.length-1;
		
		int ans = -1;
		
		while(s<=e){
			
			int mid = (s+e)/2;
			
			
			if(arr[mid]>=0){
				
				ans = mid;
				e = mid-1;
			}
			else{
				//ans = mid;//not required.....
				s = mid+1;
			}
			
			//if(arr[mid])
		}
		
		return ans;
		
		//System.out.print("ans is "+ans);
		
		//return arr[ans];
	}
}
class Solution {
	int getInsertPosition (int[] arr, int key) {
		// add your logic here
		
		int s = 0,e = arr.length-1;
		
		int ans = arr.length;
		while(s<=e){
			
			int mid = (s+e)/2;
			
			if(arr[mid]==key){
				
				ans = mid;
				return ans;
			}
			else if(arr[mid]<key){
	
				s = mid+1;
			}
			else{ //arr[mid]>key
				
				ans = mid;
				e = mid-1;
				
			}
			
		}
		
		return ans;
		
	}
}
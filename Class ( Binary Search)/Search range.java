class Solution {
	int[] searchRange (int[] arr, int key) {
		// add your logic here
		
		int[] ans = new int[2];
		
		int s = 0,e = arr.length-1;
		
		int first = -1,last = -1;
		
		while(s<=e){
			
			int mid = (s+e)/2;
			
			if(arr[mid]==key){
				
				first = mid;
				e = mid-1;
				
			}
			else if(arr[mid]<key){
				
				s = mid+1;
				
			}else{		
				e = mid-1;
			}
			
		}
		
		s = 0;e = arr.length-1;
		while(s<=e){
			
			int mid = (s+e)/2;
			
			if(arr[mid]==key){
				last = mid;
				s = mid+1;
			}
			else if(arr[mid]<key){
				s = mid+1;
			}else
				e= mid-1;
		}
		
		ans[0] = first;
		ans[1] = last;
		
		return ans;
	}
}
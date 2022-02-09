class Solution {
	int getNextGreaterElement (int[] arr, int key) {
		// add your logic here
		
		
		int s = 0,e = arr.length-1;
		
		if(key>=arr[e])
			return key;
		
		int ans = -1;
		while(s<=e){
			
			int mid = (s+e)/2;
			
			//Find the smallest array element which is greater than this
			
			if(arr[mid]==key){
				
				s = mid+1;
			}
			if(arr[mid]>key){
				
				ans = mid;
				e = mid-1;
			}
			else{ //arr[mid] < key.....
				s = mid+1;
			}
			
		}
		
		
		//System.out.print("ans is "+ans);
		
		return arr[ans];
		
		
		
	}
}
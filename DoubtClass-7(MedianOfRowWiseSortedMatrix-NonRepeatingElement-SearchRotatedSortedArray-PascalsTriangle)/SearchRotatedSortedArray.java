class Solution {
// 	private int search(int arr[], int l, int h, int key) {
//         if (l > h)
//             return -1;
 
//         int mid = (l + h) / 2;
//         if (arr[mid] == key)
//             return mid;
//         if (arr[l] <= arr[mid]) {
//             if (key >= arr[l] && key <= arr[mid])
//                 return search(arr, l, mid - 1, key);
//             return search(arr, mid + 1, h, key);
//         }
//         if (key >= arr[mid] && key <= arr[h])
//             return search(arr, mid + 1, h, key);
//         return search(arr, l, mid - 1, key);
//     }
	int search(int arr[],int low,int high,int key) {
		if(low > high) {
			return -1;
		}
		int mid = (low + high)/2;
		if(arr[mid] == key) {
			return mid;
		}
		if(arr[low] <= arr[mid]) {
			if(key >= arr[low] && key <= arr[mid]) {
				return search(arr,low,mid-1,key);
			}
			else {
				return search(arr,mid+1,high,key);
			}
		}
		else {
			if(key >= arr[mid] && key <= arr[high]) {
				return search(arr,mid+1,high,key);
			}
			else {
				return search(arr,low,mid-1,key);
			}
		}
	}
	int getElementIndex(int[] array, int target) {
	    // add your logic here
		return search(array,0,array.length-1,target);
	}
}
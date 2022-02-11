class Solution {
	int getInversionCount(int[] array) {
		// Add your logic here
		return invCount(array,0,array.length-1);
	}
	private int invCount(int ar[],int l,int r) {
		if(l < r) {
			int mid = (l + r)/2;
			int res = invCount(ar,l,mid);
			res += invCount(ar,mid+1,r);
			res += merge(ar,l,mid,r);
			return res;
		}
		return 0;
	}
	// l -> mid and mid+1 -> r
	private int merge(int ar[],int l,int mid,int r) {
		int ar1[] = new int[r-l+1];
		int i = l; // starting of first sub-array
		int j = mid+1; // starting of second sub-array
		int k = 0; // starting of ar1 (or merged array)
		int res = 0;
		while(i <= mid && j<= r) {
			if(ar[i] <= ar[j]) {
				ar1[k] = ar[i];
				k++;
				i++;
			}
			else {
				ar1[k] = ar[j];
				k++;
				j++;
				res += mid+1-i;
			}
		}
		while(i <= mid) {
			ar1[k] = ar[i];
			k++;
			i++;
		}
		while(j <= r) {
			ar1[k] = ar[j];
			k++;
			j++;
		}
		for(int i1=l;i1<=r;i1++) {
			ar[i1] = ar1[i1-l];
		}
		return res;
	}
	// private int invCount(int ar[],int l,int r) {
	// 	if(l < r) {
	// 		int mid = (l + r)/2;
	// 		int res = invCount(ar,l,mid);
	// 		res += invCount(ar,mid+1,r);
	// 		res += merge(ar,l,mid,r);
	// 		return res;
	// 	}
	// 	return 0;
	// }
	// private int merge(int ar[],int l,int mid,int r) {
	// 	int ar1[] = new int[r-l+1];
	// 	int i = l;
	// 	int j = mid+1;
	// 	int k = 0;
	// 	int res = 0;
	// 	while(i<=mid && j<=r)
	// 	{
	// 		if(ar[i] <= ar[j])
	// 			ar1[k++] = ar[i++];
	// 		else
	// 		{
	// 			ar1[k++] = ar[j++];
	// 			res += mid+1-i;
	// 		}
	// 	}
	// 	while(i<=mid)
	// 		ar1[k++] = ar[i++];
	// 	while(j<=r)
	// 		ar1[k++] = ar[j++];
	// 	for(int i1=l;i1<=r;i1++)
	// 		ar[i1] = ar1[i1-l];
	// 	return res;
	// }
}
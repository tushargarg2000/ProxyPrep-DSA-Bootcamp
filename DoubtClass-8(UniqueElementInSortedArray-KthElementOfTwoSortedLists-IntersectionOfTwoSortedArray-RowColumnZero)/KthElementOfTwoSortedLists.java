class Solution {
	int getKthElement(int[] firstArr, int[] secondArr, int k) {
	   // add logic here
		// int n = firstArr.length;
		// int m = secondArr.length;
		// int i = 0;
		// int j = 0;
		// while(i<n && j<m) {
		// 	if(firstArr[i] < secondArr[j]) {
		// 		k--;
		// 		if(k == 0) {
		// 			return firstArr[i];
		// 		}
		// 		i++;
		// 	}
		// 	else {
		// 		k--;
		// 		if(k == 0) {
		// 			return secondArr[j];
		// 		}
		// 		j++;
		// 	}
		// }
		// while(i < n) {
		// 	k--;
		// 	if(k == 0) {
		// 		return firstArr[i];
		// 	}
		// 	i++;
		// }
		// while(j < m) {
		// 	k--;
		// 	if(k == 0) {
		// 		return secondArr[j];
		// 	}
		// 	j++;
		// }
		// return -1;
		int n = firstArr.length;
		int m = secondArr.length;
		int i = 0;
		int j = 0;
		while(i< n && j<m) {
			if(firstArr[i] < secondArr[j]) {
				k--;
				if(k == 0) {
					return firstArr[i];
				}
				i++;
			}
			else {
				k--;
				if(k == 0) {
					return secondArr[j];
				}
				j++;
			}
		}
		while(i < n) {
			k--;
			if(k == 0) {
				return firstArr[i];
			}
			i++;
		}
		while(j < m) {
			k--;
			if(k == 0) {
				return secondArr[j];
			}
			j++;
		}
		return -1;
	}
}
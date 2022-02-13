public class TwoPointer {
    
    int sum = 0;
		int n = A.length;
		int i=0,j=n-1;
		while(i<j)
		{
			sum = A[i]+A[j];
			if(sum==0)
				return true;
			if(sum<0)
				i++;
			else
				j--;
		}
		return false;
}

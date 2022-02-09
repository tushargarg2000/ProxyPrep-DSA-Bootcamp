// Online Java Compiler
// Use this online editor to compile and run Java code online
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		// int a = 10;
		// long b = 1234567891145L;
		
		
		// int value = 'a';
		
		// System.out.print(value);
		
		// long value = 1234456;
		
		// int c = (int)value;
		
		// int ans = Math.pow(2,4);
			
		// int a = 10;
		// float b = 3;
		// System.out.println(a/b);
		
// 		//cin
		
 		Scanner sc = new Scanner(System.in);
		
  		int n = sc.nextInt();
		
		//New declaration of the array
		int[] arr = new int[n];
        int sum = 0;
        int maxInt = 0;
		for(int i=0;i<n;++i){
			
			sum = sum + arr[i];
			maxInt = Math.max(maxInt,sum);
		}
		
		//count how many digits 
		int count = 0;
		while(n!=0){

			int remainder = n%10;

			count++;
			n = n/10;
		}
		
		
		//Printing the subarray
		//int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int start=0;start<n;start++){
			
			
			for(int end = start;end<n;end++){
				
					
				for(int elem = start;elem<=end;elem++){
					System.out.print(arr[elem]+" ");
				}
				System.out.println();
				
			}
		}
		
		
		
		
		
	}
}
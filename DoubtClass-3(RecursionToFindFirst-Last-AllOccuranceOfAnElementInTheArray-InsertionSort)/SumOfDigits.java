import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
	public static int sumDigits(int num) {
		//Add your logic here
		if(num == 0) {
			return 0;
		}
		return num%10 + sumDigits(num/10);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(sumDigits(num));
	}
}
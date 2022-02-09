import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
	
	public static void printDigits2(int num) {
		if(num > 0) {
			System.out.println(num%10);
			printDigits2(num/10);
		}
	}
	public static void printDigitsReverse(int num) {
		//Add your logic here
		if(num == 0) {
			System.out.println(0);
		}
		else {
			printDigits2(num);
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		printDigitsReverse(num);
	}
}
import java.util.Scanner;

public class Factorial
{
	public static void main(String [] args)
	{
		numbers();
		return;
	}
	public static void numbers()
	{
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter Number: "); 
		int num1 = scnr.nextInt();
		
      
       int result = 1;
       for (int i = 1; i <= num1; i++) {
           result = result * i;
       }
       System.out.println("Factorial is : " + result);
	}
}
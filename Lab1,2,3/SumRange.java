import java.util.Scanner;

public class SumRange
{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1 = scnr.nextInt();
		System.out.print("Enter Last Number : ");
		int num2 = scnr.nextInt();
		int num4 = 0;
		while(num1 <=num2)
		{
			num4 = num1 + num4;
			num1++;
			
		}
		System.out.print("SUM: "+num4);
	}
}
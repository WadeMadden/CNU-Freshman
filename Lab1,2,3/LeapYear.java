import java.util.Scanner;

public class LeapYear
{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter year : ");
		int num1 = scnr.nextInt();
		
		if((num1 % 4 == 0) && (num1 % 100 != 0) || (num1 % 400 == 0))
		{
			System.out.print("IT IS A LEAP YEAR");
		}
		else
		{
			System.out.print("IT IS NOT A LEAP YEAR");
		}
	}
}
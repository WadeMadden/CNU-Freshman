import java.util.Scanner;

public class Message
{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num1 = scnr.nextDouble();
		int num2 = (int)num1;
		System.out.println(num2);

	}
}
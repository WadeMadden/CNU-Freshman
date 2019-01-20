import java.util.Scanner;

public class Absolute
{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a Value: ");
		double num1 = scnr.nextDouble();
		double num2 = Math.abs(num1);
		System.out.println("Absolute Value: "+num2);

	}
}
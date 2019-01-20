import java.util.Scanner;

public class Minimum
{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter Value 1: ");
		double a = scnr.nextDouble();
		System.out.print("Enter Value 2: ");
		double b = scnr.nextDouble();
		System.out.print("Enter Value 3: ");
		double c = scnr.nextDouble();
		if((a<=b)&&(a<=c))
		{
			System.out.print("Minimum Value: "+a);
		}
		else if((b<=c)&&(b<=a))
		{
			System.out.print("Minimum Value: "+b);
		}
		else if((c<=b)&&(c<=a))
		{
			System.out.print("Minimum Value: "+c);
		}
}
}
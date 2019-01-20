import java.util.Scanner;

public class DivisibleBy6or17
{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in); 
		int num1 = 0;
		int i = 0;
		while(num1 == 0)
		{
			
			System.out.println("Enter Value : ");
			int num2 = scnr.nextInt();
			int num3 = num2 % 6;
			int num4 = num2 % 17;
			if((num3 == 0)||(num4 == 0))
			{
				break;
			}
			i++;
		}
		System.out.println("Numbers read: "+i);
	}
}
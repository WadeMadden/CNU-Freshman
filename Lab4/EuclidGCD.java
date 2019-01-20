import java.util.Scanner;

public class EuclidGCD
{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = scnr.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = scnr.nextInt();
		
		int num3 = 0;
		int num4 = 0;
		int bigger = 0;
		int smaller = 0;
		int i = 0;
		if((num1<0)||(num2<0))
		{
			System.out.println("POSITIVE NUMBERS ONLY");
			//System.exit(0);
		}
		else
		{
		if(num1>num2)
		{
			bigger = num1;
			smaller = num2;
		}
		else if(num2>num1)
		{
			bigger = num2;
			smaller = num1;
		}
		for(i = bigger; i>0;i--)
		{
			num3 = bigger%i;
			num4 = smaller%i;
			if((num3==0)&&(num4==0))
			{
				System.out.println("The GCD of "+bigger+" and "+smaller+" is :"+i);
				break;
			}
		}
		}
		
	}
}
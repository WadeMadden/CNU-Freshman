import java.util.Scanner;

public class MathMethods
{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.println("Absolute Value: "+absoluteValue(-4));
		System.out.println("Minimum Value: "+minOf3Numbers(-4,5,6));
		System.out.println(leapYear(2000));
		System.out.println(factorial(5));
		System.out.println(GCD(20,10));
		return;
	}
	public static double absoluteValue(double num1)
	{
		double num2 = Math.abs(num1);
		return num2;
	}
	public static double minOf3Numbers(double a, double b, double c)
	{
		double ans = 0;
		if((a<=b)&&(a<=c))
		{
			ans = a;
		}
		else if((b<=c)&&(b<=a))
		{
			ans = b;
		}
		else if((c<=b)&&(c<=a))
		{
			ans = c;
		}
		return ans;
	}
	public static String leapYear(int numYear)
	{
		if((numYear % 4 == 0) && (numYear % 100 != 0) || (numYear % 400 == 0))
		{
			return "IT IS A LEAP YEAR";
		}
		else
		{
			return "IT IS NOT A LEAP YEAR";
		}
	}
	public static String factorial(int numFact)
	{
		int result = 1;
       for (int i = 1; i <= numFact; i++) {
           result = result * i;
       }
       return "The factorial of "+numFact+" is : " + result;
	}
	public static  String GCD(int num1, int num2)
	{
		int num3 = 0;
		int num4 = 0;
		int bigger = 0;
		int smaller = 0;
		int i = 0;
		int ans = 0;
		if((num1<0)||(num2<0))
		{
			return "POSITIVE NUMBERS ONLY";
			
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
				ans = i;
				break;
				
			}
		}
		return "The GCD of "+bigger+" and "+smaller+" is :"+ans;
		}
	}
	
}
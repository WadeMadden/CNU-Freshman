import java.util.Scanner;

public class FunnyAverage
{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in); 
		System.out.println("How Many Values To Read ? ");
		int numTimes = scnr.nextInt();
		
		int i = 1;
		double t = 0.0;
		double num1 = 0.0;
		double average = 0.0;
		while(i <= numTimes)
		{
			
			System.out.println("Enter Value : ");
			int num2 = scnr.nextInt();
			int num3 = num2 % 6;
			int num4 = num2 % 17;
			if((num3 == 0)||(num4 == 0))
			{
				num1 = num1 + num2;	
				t++;
			}
			
			i++;
		}
		average = num1/t;
		if(average>0)
		{
			System.out.println("Average: "+average);
		}
		else
		{
			System.out.println("NONE DIVISIBLE");
		}
		
	}
}
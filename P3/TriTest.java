import java.util.Scanner;

public class TriTest{
	public static void main(String [] args)
	{
		int i = 0;
		
		int um = 0;
		Scanner scnr = new Scanner(System.in);
		int g = 0;
		int numRows=0;
		while(g == 0)
		{
			System.out.println("Input an amout of rows in between 4 and 80.");
			numRows = scnr.nextInt();
			if((numRows<4)||(numRows>80))
			{
				System.out.println("Please input the amount of rows in the correct range.");
				continue;
			}
			else
			{
				break;
			}
		}
		System.out.print("  |");
		for (int p =0; p<numRows; ++p)
        {
            System.out.print("-");
            
        }
        System.out.println("/");
		for(i = numRows; i > 0; i--)
		{
			System.out.print(String.format("%2d",um)+"|");
			um++;
			for (int j=1; j < i; ++j)
            {
                System.out.print("*");
            }
            System.out.println("/");
		} 
	}
}
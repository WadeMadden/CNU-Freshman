/*Wade Madden and Sam Sklopan
This program took one hour.
We worked together for this program.
This program creates a happy pine tree.
*/

import java.util.Scanner;

public class Tri5
{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		int numRows = 0;
		int i = 0;
		int t = 0;
		int um = 0;
		int j = 0;
		int g = 0;
		int k = 0;
		
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
		
		
		for(i = numRows; i > 0; i--)
		{
		System.out.print(String.format("%2d",um)+"");
			
			for (j=1; j < i; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("/");
            for(t = 1;t<=um;t++)
            {
            	if(um==numRows)
            	{
            		break;
            	}
            	System.out.print("**");
            }
            um++;
            System.out.println("\\");
            
		}
		while(k<=numRows)
		{
			k++;
			System.out.print(" ");
		}
		System.out.print("||");
	}
}
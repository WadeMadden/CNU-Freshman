/*Wade Madden and Sam Sklopan
This program took one hour.
We worked separately for this program.
This program creates an upside-down inverted right triangle.
*/

import java.util.Scanner;

public class Tri2{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		int g = 0;
		int numRows=0;
		int t = 0;
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
		System.out.print("  \\");
        for (int i =0; i<numRows; ++i)
        {
            System.out.print("-");
        }
        System.out.println("|"); // note 2 blank spaces
       
        for (int i=0; i < numRows; ++i)
        {
            System.out.print(String.format("%2d",i)+" ");
            
            for (int j=0; j < i; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("\\");// note the double \ 
            for( t = numRows-i; t > 0; t--)
            {
            	
            	for (int y=1; y < t; ++y)
            	{
           			System.out.print("*");
           		}
           		System.out.print("|");
            	break;
            }  
            System.out.println("");//  required to print backslash
           
        }
        
	}
}
/*Wade Madden and Sam Sklopan
This program took one hour.
We worked separately for this program.
This program creates a standard right triangle.
*/

import java.util.Scanner;

public class Tri1{
	public static void main(String [] args)
	{
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
		for (int i=0; i < numRows; ++i)
        {
            System.out.print(String.format("%2d",i)+"|");
            for (int j=0; j < i; ++j)
            {
                System.out.print("*");
            }
            System.out.println("\\"); // note the double \ 
                                      //  required to print backslash
        }
        System.out.print("  |"); // note 2 blank spaces
        for (int i =0; i<numRows; ++i)
            System.out.print("_");
        System.out.println("\\");
	}
}
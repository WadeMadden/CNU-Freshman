
/**
 * This program took me about an hour to complete
 * 
 * @author Wade Madden 
 * @version 10/23/2015
 */
import java.util.Scanner;
public class P4
{
    private static Scanner scnr = new Scanner(System.in);
    
    public static void main(String [] args)
    {
        part1();
        part2();
    }
    /**
    * Part 1 of this class will ask the user to enter a date as a string in MM/DD/YYYY format and 
    * will return the day of the week, and reformat the date.
    * @param no parameters are needed.
    * @return does not return anything.
    */
    public static void part1()
    {
        int p = 0;
        String date = "";
        while(p==0)//continues asking the user for a date until the date entered is valid
        {
            System.out.println("Please enter a date in the MM/DD/YYYY format:");
            date = scnr.nextLine();
            if(P5.isDateValid(date))
            {
                break;
            }
            else
            {
                System.out.println("Incorrect format, please make sure your entry is in MM/DD/YYYY format:");
                
            }
        }
        int month = P5.getMonth(date);
        int day = P5.getDay(date);
        int year = P5.getYear(date);
        String weekDay = P5.dayOfWeek(month, day, year);
        String reformDate = P5.reformatDate(date);
        System.out.println("The date you entered is "+weekDay+", "+reformDate+".");
    }
   /** 
   * Part 2 of this class will ask the user to enter a date as a string in MM/DD/YYYY format and a number to determine how many days in the future (positive value) or in the past (negative number) 
   * the date will be and will return the future or past date.
   * @param no parameters are needed.
   * @return does not return anything.
   */
    public static void part2()
    {
        int p = 0;
        String date = "";
        while(p==0)//continues asking the user for a date until the date entered is valid
        {
            System.out.println("Please enter a date in the MM/DD/YYYY format:");
            date = scnr.nextLine();
            if(P5.isDateValid(date))
            {
                break;
            }
            else
            {
                System.out.println("Incorrect format, please make sure your entry is in MM/DD/YYYY format:");
                
            }
            
        }
        int year = P5.getYear(date);
        String reformDate = P5.reformatDate(date);
        System.out.println("Please enter the number of days in the past (negative) or future (positive) you want to find: ");
        int numDays = scnr.nextInt();
        
        int numDate = P5.convertToJul(date);
        int newDate = numDays + numDate;
        String tense = "";
        String tense2 = "";
        if(numDays>0)//determines the tense of the new date and uses grammar accordingly
        {
            tense = "will be";
            tense2 = "after";
        }
        else
        {
            tense = "was";
            tense2 = "before";
        }
        
        if(newDate>365)//calculates what year the new date is in.
        {
            year = year+1;
            newDate = newDate - 365;
            
        }
        else if(newDate<0)
        {
            year = year - 1;
            newDate = newDate + 365;
            
        }
        
        String newestDate = P5.convertToMMDDYYYY(newDate, year);
       
        String ans = P5.reformatDate(newestDate);
        int month1 = P5.getMonth(newestDate);
        int day1 = P5.getDay(newestDate);
        int year1 = P5.getYear(newestDate);
        String weekDay = P5.dayOfWeek(month1, day1, year1);
        int posNum = Math.abs(numDays);//converts numDays to a positive integer.
        
        System.out.println(posNum+" days "+tense2+" "+date+" "+tense+" "+weekDay+", "+ans+".");
        
    }
    // instance variables - replace the example below with your own
    
}

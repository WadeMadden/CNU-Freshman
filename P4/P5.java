/**
 * This program took about 2 hours to complete.
 * This class can be accessed to help modify and calculate dates.
 * We worked seperately on this program and then met in the Hunter Creech lab to compare.
 * @author Wade Madden and Nathan Gorman
 * @version 11/09/2015
 */

import java.util.Calendar;

public class P5
{
	private static final int[ ] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static int yearReturn;
	private static int dayReturn;
	private static int monthReturn;
	/**
	*converts a String in the format mm/dd/yyyy to a year free Julian date (how many days into the year the mm/dd date is) For example, 12/31 is 365.
	*@param dateString - String in the format mm/dd/yyyy
	*@return returns how many days into the year mm/dd is
	*/
	public static int convertToJul(String dateString)
	{
		getYear(dateString);
		getMonth(dateString);
		getDay(dateString);
		int julInt = dayReturn + daysBeforeMonth(monthReturn);
		return julInt;
	}
	/**
	*converts from Julian day to mm/dd/yyyy format (e.g., convertToMMDDYYYY(32, 2015) should return '02/01/2015/')
	*@param jul - number of days into a year (e.g., 32 is Feb 1) 
	*@param year - year in integer format (e.g., 2015)
	*@return a String in the format mm/dd/yyyy
	*/
	public static String convertToMMDDYYYY(int jul, int year)
	{
		int ans = 0;
		int num = 0;
		int j = 0;
		String date = "";
		for(int i = 0; i<daysInMonth.length;i++)
		{
			j++;
			ans = ans + daysInMonth[i];
			if(jul<ans)
			{
				num = jul - daysBeforeMonth(j);
				if(jul == daysBeforeMonth(j))
				{
					j = j-1;
					num = daysInMonth[j-1];
					System.out.println(num);
				}
				break;
			}
		}
		if(j<10)
		{
			if(num<10)
			{
				date = String.valueOf("0"+j+"/0"+num+"/"+year);
			}
			else
			{
				date = String.valueOf("0"+j+"/"+num+"/"+year);
			}
		}
		else
		{
			if(num<10)
			{
				date = String.valueOf(j+"/0"+num+"/"+year);
			}
			else
			{
				date = String.valueOf(j+"/"+num+"/"+year);
			}
		}
		return date;
	}
	/**
	*returns the day of the week (Sunday, Monday, etc) of the month/day/year.
	*@param month - represents the month (1..12)
	*@param day - day of the month
	*@param year - integer form of the year
	*@return the day of the week ('Sunday', 'Monday', etc) of month/day/year
	*/
	public static String dayOfWeek(int month, int day, int year)
	{
		
		String[ ] dayNames = {"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};
 
        Calendar cal = Calendar.getInstance();
        cal.set( year, month-1,day);
        
        int weekDay = cal.get(cal.DAY_OF_WEEK)-1;
        return dayNames[weekDay];
	}
	/**
	* returns the day portion of the date
	*@param dateString - date in the format mm/dd/yyyy
	*@return the dd part of the date (day) as an integer
	*/
	public static int getDay(String dateString)
	{		
		String day = dateString.substring(3,5);
		dayReturn = Integer.parseInt(day);
		return dayReturn;
	}
	/**
	*returns the month portion of the date
	*@param dateString - date in the format mm/dd/yyyy
	*@return the mm part of the date (month) as an integer
	*/
	public static int getMonth(String dateString) 
	{
		String month = dateString.substring(0,2);
		monthReturn = Integer.parseInt(month);
		return monthReturn;
	}
	/**
	* returns the year portion of the date
	*@param dateString - date in the format mm/dd/yyyy
	*@return the yyyy part of the date (year) as an integer
	*/
	public static int getYear(String dateString)
	{
		String year = dateString.substring(6);
		yearReturn = Integer.parseInt(year);
		return yearReturn;
	}
	/**
	*returns true is the parameter is in a date format
	*@param s - String checked to be in the form mm/dd/yyyy
	*@return true if the date is in the form mm/dd/yyyy, false otherwise
	*/
	public static boolean isDateValid(String s){
		getYear(s);
		getMonth(s);
		getDay(s);
		
		boolean value = true;
		int i = 0;
		if((monthReturn<=0)||(monthReturn>=13))
		{
			value = false;
		}
		if(dayReturn<1)
		{
			value = false;
		}
		if(monthReturn == 1)
		{
			if(dayReturn>31)
			{
				value = false;
			}
		}
		else if(monthReturn == 2)
		{
			if(dayReturn>28)
			{
				value = false;
			}
		}
		else if(monthReturn == 3)
		{
			if(dayReturn>31)
			{
				value = false;
			}
		}
		else if(monthReturn == 4)
		{
			if(dayReturn>30)
			{
				value = false;
			}
		}
		else if(monthReturn == 5)
		{
			if(dayReturn>31)
			{
				value = false;
			}
		}
		else if(monthReturn == 6)
		{
			if(dayReturn>30)
			{
				value = false;
			}
		}
		else if(monthReturn == 7)
		{
			if(dayReturn>31)
			{
				value = false;
			}
		}
		else if(monthReturn == 8)
		{
			if(dayReturn>31)
			{
				value = false;
			}
		}
		else if(monthReturn == 9)
		{
			if(dayReturn>30)
			{
				value = false;
			}
		}
		else if(monthReturn == 10)
		{
			if(dayReturn>31)
			{
				value = false;
			}
		}
		else if(monthReturn == 11)
		{
			if(dayReturn>30)
			{
				value = false;
			}
		}
		else if(monthReturn == 12)
		{
			if(dayReturn>31)
			{
				value = false;
			}
		}
		return value;
	}
	/**
	*Calculates the number of days before a given month
	*@param month - month to be checked how many days occur before it
	*@return the number of days before the given month
	*/
	public static int daysBeforeMonth(int month)
	{
		int ans = 0;
		for(int i = 0; i<month-1; i++)
		{
			ans = ans + daysInMonth[i];	
		}
		return ans;
	}
	/**
	*Converts the format of a MM/DD/YYYY format date into month DD, YYYY format
	*@param dateString - date in the form MM/DD/YYYY
	*@return the date formatted as a month, dd, yyyy format
	*/
	public static String reformatDate(String dateString)
	{
		String date = "";
		getYear(dateString);
		getMonth(dateString);
		getDay(dateString);
		String[ ] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October","November", "December"};
		String month = monthNames[monthReturn-1];
		if(dayReturn<10)
		{
			date = String.valueOf(month+" 0"+dayReturn+", "+yearReturn);
		}
		else
		{
			date = String.valueOf(month+" "+dayReturn+", "+yearReturn);
		}
		return date;
	}
}
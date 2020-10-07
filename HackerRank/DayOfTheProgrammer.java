/* Find 256th day
 * 
 *  In 1918, the next day after January 31st was February 14th. 
 *  This means that in 1918, February 14th was the 32nd day of the year in Russia (i.e, +13)
 * 
 * 
 * Gregorian calendar, leap years are either of the following:
 *
 * Divisible by 400.
 * Divisible by 4 and not divisible by 100.
 */
package Hackerrank;

public class DayOfTheProgrammer {

	static String date(int year)
	{
		String day ="";
		if(year < 1918)
		{
			day += (year % 4 == 0) ? "12.09."+year : "13.09."+year;
		}
		else if(year == 1918)
		{
			day += "26.09."+year;
		}
		else
		   day += (year % 400 == 0 || (year % 4 == 0) && year %100 != 0) ? "12.09"+year : "13.09."+year;
		
		return day;
	}
	
	public static void main(String[] args)
	{
		int year = 2100;
		System.out.println(date(year));
	}
}

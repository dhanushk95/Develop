package Hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
	
	static void convert(String s) throws ParseException
	{
		SimpleDateFormat input = new SimpleDateFormat("hh:mm:ssaa");
		
		SimpleDateFormat output = new SimpleDateFormat("HH:mm:ss");
		
		Date date = null;
		String str = null;
		
		date = input.parse(s);
		str = output.format(date);
		
		System.out.println(str);
	}
	public static void main(String[] args) throws ParseException
	{
		String s = "02:10:30pm";
		
		convert(s);
	}

}

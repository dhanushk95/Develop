package String;

import java.util.Scanner;

public class UniqueChar {
	
	  boolean unique(String str)
	{
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j))
					return false;
			}
		}
		return true;
	}

	public static void main(String args[])
	{
		UniqueChar obj = new UniqueChar();
		System.out.println("Enter the String");
		
		Scanner sc = new Scanner(System.in);
		String Str = sc.nextLine();
			
		if(obj.unique(Str))
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
		sc.close();
	}
}

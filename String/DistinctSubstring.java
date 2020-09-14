package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctSubstring {

	static Set<String> distinctsubstring(String str)
	{
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0; i<=str.length(); i++)
		{
			for(int j=i+1; j<=str.length(); j++)
			{
				set.add(str.substring(i, j));
			}
		}
		return set;
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter the String ");
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		System.out.println(distinctsubstring(S));
		sc.close();
	}
}

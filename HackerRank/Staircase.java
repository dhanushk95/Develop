package Hackerrank;

import java.util.Scanner;

public class Staircase {
	
	static void stairLeft(int n)
	{
		int c = n-1;
	
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(j<c)					     // if(j>c) output will be mirror image of j<c
					System.out.print(" ");
				
				else 
					System.out.print("#");
			}
			System.out.println();
			c = c-1;
		}
	} 
	static void stairRight(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i>=j)
					System.out.print("#");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		int n = 4;
		
		System.out.println("Enter Direction");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(str.equalsIgnoreCase("left"))
		{
			stairLeft(n);
		}
		else if(str.equalsIgnoreCase("right"))
		{
			stairRight(n);
		}
		else System.out.println("only left or right direction is valid");
		sc.close();
		
	}

}

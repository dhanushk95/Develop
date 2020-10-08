package Arithmetic;

import java.util.Scanner;

public class Calculator {
	

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		System.out.println("Enter the first num");
		
		Scanner sc = new Scanner(System.in);
		double fnum = sc.nextDouble();
		
		System.out.println("Enter the operator(+,-,*,/) ");
		char opr = sc.next().charAt(0);
		
		System.out.println("Enter the second num");
		double snum = sc.nextDouble();
		
		double ans;
		
		switch(opr)
		{
		case '+':
			ans = fnum + snum;
			break;
			
		case '-':
			ans = fnum - snum;
			break;
			
		case '*':
			ans = fnum * snum;
			break;
			
		case '/':
			ans = fnum / snum;
			break;
			
		default:
			System.out.println("Error! operator does not match");
			return;
		}
		
		System.out.println("Answer "+ ans);
		sc.close();
	}

}

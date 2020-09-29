package Arithmetic;

public class Factorial {

	static int fact(int n)
	{
		int num = 1;
		for(int i=1; i<=n; i++)
		{
			num = num*i;
		}
		return num;
	}
	public static void main(String[] args)
	{
		int n=6;
		System.out.println(fact(n));
		
	}
}

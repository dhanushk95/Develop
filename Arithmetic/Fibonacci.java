package Arithmetic;

public class Fibonacci {
	
	static void fibo(int N)
	{
		int num1 = 0, num2 = 1;
		int count = 0;
		
		while(count < N)
		{
			System.out.print(num1+" ");
			int num3 = num1 + num2;
			
			num1 = num2;
			num2 = num3;
			count +=1;		
		}	
	}
	public static void main(String args[])
	{
		int n = 15;
		fibo(n);
	}

}

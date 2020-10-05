package Arithmetic;

public class Armstrong {
	
	int order(int x)					//Calculate no. of digits, so that it can be raised to power
	{
		int n=0;
		while(x !=0)
		{
			n++;
			x=x/10;
		}
		return n;
	}
	int power(int x, int n) 			//Calculating power
	{
		if (n == 0) 									
			  return 1;
		
		 return x* power(x, n-1);
	}
	
	void isArmstrong(int num)
	{
		int digits = order(num);
		int temp=num, sum=0;
		while(temp !=0)
		{
			int rem =temp%10;
			sum += power(rem,digits);
			temp = temp/10;
		}
		if(sum == num)
			System.out.println("Given num is a armstrong num");
		else
			System.out.println("nope");
	}
	public static void main(String args[])
	{	
		Armstrong arm = new Armstrong();
		int x=9474;
		arm.isArmstrong(x);
	}

}



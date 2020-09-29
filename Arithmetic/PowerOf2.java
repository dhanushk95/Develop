package Arithmetic;

public class PowerOf2 {
	
	static boolean isPower(int n)
	{
		if(n == 0 && n == 1)
			return false;
		
		while(n != 2)
		{
			if(n % 2 != 0)
				return false;
			n = n/2;
		}
		return true;
	}
	public static void main(String[] args)
	{
		int n = 3;
		if(isPower(n))
			System.out.println("the number is a Power of 2");
		else
			System.out.println("Nope");
	}

}

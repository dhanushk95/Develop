package Hackerrank;

public class ApplesAndOranges {

	static void count(int s, int t, int a, int b, int[] apples, int[] oranges)
	{
		int apple_count = 0, orange_count = 0;
		
		for( int i : apples)
		{
			if(s<=i+a && t>=i+a)
				apple_count++;
		}
		for(int j : oranges)
		{
			if(s<=j+b && j+b<=t)
				orange_count++;
		}
		System.out.println(apple_count);
		System.out.println(orange_count);
	}
	public static void main(String[] args)
	{
		int s=7, t=11, a=5, b=15;
		int[] apples = {-2,2,1,4};
		int[] oranges = {5,-6,-4,};
		
		count(s, t, a, b, apples, oranges);
	}
	
}

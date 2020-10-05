package Hackerrank;

public class HurdleRace {
	
	static int doses(int k, int[] height)
	{
		int max = height[0];
		
		for(int i=0; i<height.length; i++)
		{
			if(height[i] > max)
				max = height[i];
		}
		
		if(k < max)
			return Math.abs(k - max);
		
		else 
			return 0;		
	}
	public static void main(String[] args)
	{
		int k = 5;
		int[] arr = {1,3,6,4};
		
		System.out.println(doses(k, arr));
	}

}

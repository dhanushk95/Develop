package Hackerrank;

public class ElectronicsShop {

	static int getMoney(int[] key, int[] usb, int b )
	{
		int maxSpent =-1;
		for(int i=0; i<key.length; i++)
		{
			for(int j=0; j<usb.length; j++)
			{
				int sum = key[i] + usb[j];
				if(sum <= b && sum > maxSpent)
					maxSpent = sum;
			}
		}
		return maxSpent;
	}
	public static void main(String[] args)
	{
		int b=10;
		int[] key = {3,1};
		int[] usb = {5,2,8};
		
		System.out.println(getMoney(key,usb,b));
	}
}

package Hackerrank;

public class DrawingBook {
	
	static int pageCount(int n, int p)
	{
		int from_Front = p/2;
		int from_Back = n/2 - p/2;
		
		return Math.min(from_Front, from_Back);
	}
	public static void main(String[] args)
	{
		int n = 10, p = 9;
		
		System.out.println(pageCount(n, p));
	}

}

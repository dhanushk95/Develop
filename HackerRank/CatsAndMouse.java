package Hackerrank;

public class CatsAndMouse {
	
	static String catMouse(int x, int y, int z)
	{
		int catA = Math.abs(x - z);
		int catB = Math.abs(y - z);
		
		if(catA < catB)
			return "Cat A";
		
		else if(catB < catA)
			return "Cat B";
		
		else
			return "Mouse C";
	}
	public static void main(String[] args)
	{
		int x=1, y=4, z=2;
		
		System.out.println(catMouse(x, y, z));
	}

}

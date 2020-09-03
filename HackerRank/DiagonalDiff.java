package Hackerrank;

public class DiagonalDiff {
	
	public static int difference(int arr[][])
	{
		int diag1 = 0, diag2 = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			diag1 += arr[i][i];
			diag2 += arr[i][arr.length-i-1];
		}
		return Math.abs(diag1 - diag2);
	}

	public static void main(String args[])
	{
		int arr[][] = {{ 1,3,-5 },
		 			   { 4,0,2 },
		 			   { 3,8,2} };
		difference(arr);
		
		System.out.println(difference(arr));
	}
}

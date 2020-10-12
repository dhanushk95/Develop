package Hackerrank;

public class DesignerPDFViewer {
	
	static int design(int[] h, String word)
	{
		int max=0;
		
		for(int ch : word.toCharArray())
		{
			int index = ch - 'a';
			
			if(max < h[index])
				max = h[index];
		}
		return max*word.length();
	}
	public static void main(String args[])
	{
		int[] arr = {1,1,2,2,3,3,4,4,5,5,1,1,12,3,4,5,12,34,5,2,1,2,3,4,5,2};
		
		String str = "apple";
		
		System.out.println(design(arr, str));
	}

}

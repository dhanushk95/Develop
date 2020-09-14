package String;

public class Pangram {

	static int size =26;
	static boolean isLetter(char ch)				//Checking if string has a character
	{
		if(!Character.isLetter(ch))
			return false;
		
		return true;
	}
	
	static boolean allLetter(String str)
	{
		str = str.toLowerCase();
		
		boolean[] present = new boolean[size]; 			//boolean array of size 26 i.e only filled with 
														//values true and false
		for(int i=0; i<str.length(); i++)
		{
			if(isLetter(str.charAt(i))) 
			{
				int letter = str.charAt(i) - 'a'; 		//Subtracting with 'a' because of ascii value
				present[letter] = true; 				//if letter present, changing value to true
			}
		}
		for(int i=0; i<size; i++)    					//Traversing present array
		{
			if(!present[i])
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		String str = "The quick brown fox jumps over the lazy dog";
		
		if(allLetter(str))
			System.out.println("String is a Pangram");
		
		else System.out.println("String is not a Pangram");
			
	}
}

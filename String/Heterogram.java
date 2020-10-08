package String;

public class Heterogram { 								//No letter occurs more than once
		
	static boolean isHeterogram(String str)
	{
		int hash[] = new int[26];
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) != ' ') 					//Ignoring space
			{
				if(hash[str.charAt(i) - 'a'] == 0 )
				{
					hash[str.charAt(i) - 'a'] =1;
				}
				else return false;
			}
		}
		return true;
	}
	
	public static void main(String args[])
	{
		String str = "zion";
		
		if(isHeterogram(str))
			System.out.println("Yes, it is Heterogram");
		else
			System.out.println("Nope");
	}
}

package String;

public class CompareString {
	
	static boolean isEqual(String str1, String str2)
	{
		int x = str1.compareToIgnoreCase(str2); 		//Method 1
		
		if(x != 0)
			return false;
									//Remove IgnoreCase for case sensitive
		else return true;
		
		/*if(str1.equalsIgnoreCase(str2))             		//Method 2
			return true;
		
		else return false;*/
	}
	public static void main(String args[])
	{
		String a = "kilo", b= "gram";
		
		if(isEqual(a, b))
			System.out.println("Strings are same");
		
		else System.out.println("Different");
	}

}

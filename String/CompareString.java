package String;

public class CompareString {
	
	static boolean ignoreCase(String str1, String str2)
	{
		str1 = str1.toUpperCase(); 						//Ignore this, to compare for case sensitive
		str2 = str2.toUpperCase();
		
		int x = str1.compareTo(str2);
		
		if(x != 0)
			return false;
		
		else return true;
	}
	public static void main(String args[])
	{
		String a = "kilo", b= "gram";
		
		if(ignoreCase(a, b))
			System.out.println("Strings are same");
		
		else System.out.println("Different");
	}

}

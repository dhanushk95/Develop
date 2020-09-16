package String;

public class SwapString {

	public static void main(String args[])
	{
		String a = "Hello";
		String b = "world";
		
		swap(a,b);
	}

  static void swap(String a, String b)           				//Using 3rd Variable
/* {
	String temp = a;
	a = b;
	b = temp;
	
	System.out.println("After swap a is " +a+ " b is " +b);
 } */
  {
	  a = a + b; 					//Append 2nd String to 1st
	  
	  b = a.substring(0, a.length() - b.length());   //Store Initial String a in b
	  
	  a = a.substring(b.length());   			//Store String b in a
	  
	  System.out.println("After swap a is "+a+" b is "+b);
  }
}  



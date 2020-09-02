package Hackerrank;

public class SumArray 
	{
	  
	 static int Sum(int ar[]) {

	    int sum =0;
	    for(int i=0; i<ar.length; i++)
      {
		      sum += ar[i];
	    }
       return sum;
   }
	public static void main(String args[])
	 {
          int ar[] = {1,9,7,3,5};
          Sum(ar);  
            
          System.out.println(Sum(ar));
	 }

}


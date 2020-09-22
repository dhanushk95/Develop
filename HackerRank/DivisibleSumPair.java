package Hackerrank;

public class DivisibleSumPair {

	 static int divisibleSumPairs(int k, int[] ar) 
	 {
		 int count =0;
	     for(int i=0; i<ar.length; i++)
	     {
	         for(int j=i+1; j<ar.length; j++)
	          {
	             
				if((ar[i]+ar[j])%k == 0)
	                  count++;
	           }
	     }
	     return count;
}
	 public static void main(String args[])
	 {
		 int k =3;
		 int ar[] = {1, 3, 2, 6, 1, 2};
		 
		 System.out.println(divisibleSumPairs(k, ar));
	 }
} 

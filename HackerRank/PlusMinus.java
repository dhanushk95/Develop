package Hackerrank;

/*Given an array of integers, calculate the ratios of its elements that are positive, negative,and zero.
Print the decimal value of each fraction on a new line with 6 places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
though answers with absolute error of up to 10^-4 are acceptable.

Example
array=[1,1,0,-1,-1]
There are n=5 elements, 2 positive, 2 negative and 1 zero.Their ratios are 2/5=0.400000,2/5=0.400000 
and 1/5=0.200000.

Results are printed as:

0.400000
0.400000
0.200000 */

public class PlusMinus {

	static void Count(int ar[])
     {
	  float cp=0,cn=0,cz=0;
	for(int i=0; i<ar.length; i++)
	{
 	  if(ar[i]<0)
	  {
 		cn++;
	  } 
	 else if(ar[i]==0)
	 {
		cz++;
	  } else
 	    cp++;
	}
	float pos = cp/ar.length;
	float neg = cn/ar.length;
	float zer = cz/ar.length;

	System.out.println(pos+"\n"+neg+"\n"+zer);
      }
	public static void main(String args[])
      {
	int ar[] ={1,-2,3,-4,-5,0,6,-8,0};
	Count(ar);
      }
}

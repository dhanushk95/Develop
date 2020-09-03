package Hackerrank;

/*You are in charge of the cake for your niece's birthday and have decided the cake will have one candle 
for each year of her total age. When she blows out the candles, she’ll only be able to blow out the 
tallest ones. Your task is to find out how many candles she can successfully blow out.

For example, if your niece is turning 4 years old, and the cake will have 4 candles of height 4,4,1,3.
she will be able to blow out 2 candles successfully, since the tallest candles are of height 4 and 
there are 2 such candles.

Sample Input
4
3 2 1 3
Sample Output
2
*/

public class BirthdayCandles {

	  static void CandlesCount(int[] ar) {
	        
	        int max=0,count=0;
	        for(int i=1; i<ar.length; i++)
	        {
	            if(ar[i]>max)
	                max=ar[i];
	        }
	        for(int e: ar)
	        {
	            if(e==max)
	                count++;
	        }
	        System.out.println(count);
	       
	    }
	  public static void main(String args[])
	  {
		  int ar[]= {1,2,4,5,6,6,6,6,6};
		  CandlesCount(ar);
	
	  }

}

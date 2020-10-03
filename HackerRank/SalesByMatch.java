package Hackerrank;

import java.util.HashSet;

public class SalesByMatch {
	
	 static int sockMerchant(int[] ar) {

	        int pairs=0;
	        HashSet<Integer> set = new HashSet<Integer>();

	        for(int i=0; i<ar.length; i++)
	        {
	            if(!set.contains(ar[i]))
	            {
	                set.add(ar[i]);
	            } else 
	            {
	                pairs++;
	                set.remove(ar[i]);
	            }
	        }
	        return pairs;
	    }
	 public static void main(String args[])
	 {
		 int arr[] = {10,20,90,20,20,10,30,10,90};
		 
		 System.out.println(sockMerchant(arr));
	 }

}

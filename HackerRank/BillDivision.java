package Hackerrank;

import java.util.Arrays;
import java.util.List;

public class BillDivision {

	  static void bonAppetit(List<Integer> bill, int k, int b) {

	       float total=0;
	      for(int i=0; i<bill.size(); i++)
	      {
	            total += bill.get(i);
	      }
	        int not_eaten = bill.get(k);
	        total = total - not_eaten;

	        float bill_actual = total/2;

	        if(b == bill_actual)
	            System.out.println("Bon Appetit");

	        else
	            System.out.println(b-bill_actual);
	  }
	  public static void main(String args[])
	  {
		  List<Integer> bill = Arrays.asList(4,2,5,7);
		  int k=2, b = 8;
		  
		  bonAppetit(bill, k, b);
	  }
}

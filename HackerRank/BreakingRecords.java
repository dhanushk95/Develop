package Hackerrank;

import java.util.Scanner;

public class BreakingRecords {
	
	 static void records(int scores[])
	    {
	        int min = scores[0];
	        int max = min;
	        int max_count = 0, min_count = 0;
	        
	        for(int i=0; i<scores.length; i++)
	        {
	            if(scores[i]<min)
	            {
	                min = scores[i];
	                min_count++;
	            }
	            if(scores[i]>max)
	            {
	                max = scores[i];
	                max_count++;
	            }
	        }
	        System.out.println(max_count+" "+min_count);
	    }
	    
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();

	        int scores[] = new int[num];
	        for(int i=0; i<num; i++)
	        {
	            scores[i] = sc.nextInt();
	        }
	        sc.close();
	        records(scores);
	    }  
}

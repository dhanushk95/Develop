package Hackerrank;

import java.util.Arrays;
import java.util.List;

public class GradingStudents {
	
	 public static List<Integer> grading(List<Integer> grades) {
		    
	        for(int i=0; i<grades.size(); i++)
	        {
	            if(grades.get(i) >= 38)
	            {
	                int rem = grades.get(i) % 5;
	                int lower_mult = grades.get(i) - rem;
	                int upper_mult = lower_mult + 5;
	                int diff = upper_mult - grades.get(i);

	                if(diff < 3)
	                    grades.set(i,upper_mult);
	                
	            }
	        }
	        return grades;
	    }
	 public static void main(String args[])
	 {
		 List<Integer> grades = Arrays.asList(4,73,67,38,33);
		 
		 System.out.println(grading(grades));
	 }
}

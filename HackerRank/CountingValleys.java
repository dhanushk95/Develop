package Hackerrank;

public class CountingValleys {
	
	 public static int countValleys(int steps, String path) {
		    
	        int altitude=0;
	        int valleys=0;

	        for(int i=0; i<steps; i++)
	        {
	            if(path.charAt(i) == 'U'){
	            {
	                if(altitude == -1)
	                    valleys++;
	            }
	                altitude++;
	            }
	            if(path.charAt(i) == 'D')
	                altitude--;
	        }
	        return valleys;
	 }
	 public static void main(String args[])
	 {
		 int steps = 8;
		 String path = "DUDUDDUU";
		 
		 System.out.println(countValleys(steps, path));
	 }
}

/* Assume your bird sightings are of types arr[] = [1,1,2,2,3].There are two each of types 1 and 2,
 *  and one sighting of type 3.Pick the lower of the two types seen twice: type 1.
 *  
 *  Sample Input 1							Sample Input 2
 *  1 4 4 4 5 3 							1 2 3 4 5 4 3 2 1 3 4
 *  Output ==> 4							 Output ==> 3
 *  
 *  */

package Hackerrank;

public class MigratoryBirds {

	 static int migratoryBirds(int[] arr) {

	        int max = 0;
	        int[] count = new int[6];
	        for(int i : arr) {
	            count[i]++;
	            max = Math.max(max, count[i]);
	        }

	        for(int i=0; i<count.length; i++)
	        {
	            if(count[i] == max)
	               return i;
	        }
	        return 0; 			//Code never reaches here
	    }
	 public static void main(String args[])
	 {
		 int arr[] = {1,2,3,2 ,2,1};
		 System.out.println(migratoryBirds(arr));
		 
	 }
}

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

	  void migratoryBirds(List<Integer> arr) {

	        int max = 0;
	        int[] count = new int[6];
	        for(int i : arr) {
	            count[i]++;
	            max = Math.max(max, count[i]);
	        }

	        for(int i=0; i<count.length; i++)
	        {
	            if(count[i] == max)
	               System.out.println(i);
	        }
	    }
	 public static void main(String args[])
	 {
		 MigratoryBirds m = new MigratoryBirds();
		 
		 List<Integer> list = Arrays.asList(1,2,3,2,1,2);
		 m.migratoryBirds(list);
		 
	 }
}

/* Given a sorted list with an unsorted number in the rightmost cell, write simple code to insert
 * into the array so that it remains sorted.
 * 		arr[] = {1,2,4,5,3}
 * 
 * O/P : 1 2 4 5 5
		 1 2 4 4 5
		 1 2 3 4 5
 * 
 */
package Hackerrank;

public class InsertionSort {
	
	static void insertionSort1(int[] arr)
	{

        int n = arr.length;
        int i = arr[n-1],j;

        for(j=arr.length-2; j>-1; j--)
        {
            if(arr[j] > i)
            {
                arr[j+1] = arr[j];
                printArray(arr);
            }
            else break;
        }
        arr[j+1] =i;
        printArray(arr);
    }
     static void printArray(int[] ar) 
     {
        for(int n: ar)
        {
        	System.out.print(n+" ");
        }
       System.out.println("");
  }

     public static void main(String args[])
     {
    	 int arr[] = {2,4,6,8,3};
    	 
    	 insertionSort1(arr);
     }
}

package Hackerrank;

public class MinMax {
	
	 static void miniMaxSum(int[] arr) {

	        long min=0, max=0, sum=0;
	        min=arr[0];
	        max=min;
	        sum=min;

	        for(int i=1; i<arr.length; i++)
	        {
	            sum += arr[i];
	            if(arr[i]<min)
	            {
	                min=arr[i];
	            }
	            if(arr[i]>max)
	            {
	                max=arr[i];
	            }
	        }
	        System.out.println((sum-max)+" "+(sum-min));
	    }
	 public static void main(String args[])
	 {
		 int arr[] = {1,3,5,6,7,9};
		 miniMaxSum(arr);
	 }
	 
}

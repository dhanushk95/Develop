package Sort;

import java.util.Arrays;

public class BubbleSort {
	
	static void sort(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j] > arr[j+1])				
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}
		}
	}
	
	public static void main(String args[])
	{
		int ar[] = {2,5,9,0,-4,3,1};
		sort(ar);
		System.out.println(Arrays.toString(ar));
	}
}

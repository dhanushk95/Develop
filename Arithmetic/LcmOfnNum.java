package Arithmetic;

public class LcmOfnNum {
	
	static long lcmOfNumber(int[] arr)
	{
		int lcm =1;
		int divisor = 2;
		
		while(true)
		{
			int count = 0;
			boolean divisible = false;
			
			for(int i=0; i<arr.length; i++)
			{
				 if (arr[i] == 0) 								//If any element is zero, lcm is zero
	                    return 0; 
	                 
	                else if (arr[i] < 0) 		 				//If -ve num, changes to +ve
	                    arr[i] = arr[i] * (-1); 
	                 
	                if (arr[i] == 1) 
	                    count++; 
	                
				 if(arr[i] % divisor == 0)
				 {
					divisible = true;
					arr[i] /= divisor;
				 }
			}
			if(divisible)
				lcm *= divisor;
			
			else
				divisor++;
			
			if(count == arr.length) 
				return lcm;	
		}
	}

	public static void main(String args[])
	{
		int[] arr = {2,3,1,6,4,5};
		System.out.println(lcmOfNumber(arr));
	}
}

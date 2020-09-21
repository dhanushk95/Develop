package Hackerrank;

import java.util.LinkedList;
import java.util.List;

public class CompareTriplets {
	
	static List<Integer> compare(List<Integer> a, List<Integer> b)
	{
		int Alice =0, Bob=0;
		
		List<Integer> win = new LinkedList<Integer>();
		
		for(int i=0; i<a.size(); i++)
		{
			if(a.get(i) > b.get(i))
				++Alice;
			
			else if(a.get(i) < b.get(i))
				++Bob;
		}
		win.add(Alice);
		win.add(Bob);
		
		return win;
	}
	
	public static void main(String args[])
	{
		List<Integer> A = new LinkedList<Integer>();
		
		A.add(17);
		A.add(28);
		A.add(30);
		
		List<Integer> B = new LinkedList<Integer>();
		
		B.add(99);
		B.add(16);
		B.add(8);
		
		System.out.println(compare(A, B));
	}

}

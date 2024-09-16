package hello;

import java.util.HashSet;
import java.util.Set;

public class set {

	public static void main(String[] args) {
		
		int arr[]= {3,5,7,8,4,6,6,3};
		Set<Integer> s = new HashSet<Integer>();
		
		for(int i:arr)
		{
			s.add(i);
		}
System.out.println(s);
	}

}

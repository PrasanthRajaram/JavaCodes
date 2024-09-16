package hello;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(1,"virat");
		mp.put(2, "rahul");
		mp.put(3,"rohit");
		mp.put(4,"dhoni");
		mp.put(5,"sachin");
		
		for(int i=1;i<=5;i++)
		System.out.println(mp.get(i));
		}
		

	}


package sampleProgram;

import java.util.HashMap;

public class HashMapPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer ,String > map = new HashMap <Integer , String> ();
		map.put(1, "saffana");
		map.put(3, "mohamed");
		map.put(2, "ravi");
		map.put(5, "raj");
		System.out.println(map);
		System.out.println(map.containsKey(4));
		System.out.println(map.get(5));
		System.out.println(map.containsValue("ravi"));

	}
		

}

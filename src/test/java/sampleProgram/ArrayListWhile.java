package sampleProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList();
		list.add(20);
		list.add(10);
		list.add(34);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("Iterated value is while loop "+itr.next());
		}
		for(Integer NewList : list) {
			System.out.println("Iterated value is for each loop "+NewList);
		}  
		for(int i=0;i<list.size();i++) {
			System.out.println("Iterated value is for loop "+list.get(i));
		}
		}
		

	}



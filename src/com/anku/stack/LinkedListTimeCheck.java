package com.anku.stack;

import java.util.LinkedList;

public class LinkedListTimeCheck {

	static long startTime = System.currentTimeMillis();
	
	public static void main(String[] args) {
	
		
		LinkedList<Integer> object =new LinkedList<Integer>();
		object.add(14);
		object.add(15);
		object.add(16);
		object.add(17);
		object.add(18);
		object.add(19);
		object.add(21);
		object.add(22);
		object.add(23);
		object.add(124);
		object.add(25);
		object.add(126);
		object.add(127);
		object.add(128);
		object.add(16);
		object.add(17);

		System.out.println(object.get(15));
		//System.out.println(object);
		object.add(2, 21);
		System.out.println(object);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms"); 
	}

}

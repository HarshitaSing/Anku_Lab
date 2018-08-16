package com.anku.stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTimeCheck {
	static long startTime = System.currentTimeMillis();
	public static void main(String[] args) {
		
		List<Integer> object=new ArrayList<>();
		
		object.add(21);
		object.add(22);
		object.add(23);
		object.add(24);
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
		object.add(2, 100);
		System.out.println(object);

		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms"); 
	}

}

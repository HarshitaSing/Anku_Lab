package com.anku.stack;
import java.util.*;

public class LinkedListProg {
	static long startTime = System.currentTimeMillis();
	
	public static void main(String[] args) {

		LinkedList<Integer> object =new LinkedList<Integer>();
	
		object.add(2);
		object.add(3);
		object.add(4);
		object.add(5);
		object.add(6);
		object.add(7);
		
		System.out.println(object);
		object.add(5, 12);
		System.out.println(object);

		int l1=object.size();
		System.out.println(l1);

		boolean status = object.contains(15);
		System.out.println(status);
		
		object.addFirst(1);
		object.addLast(20);
		System.out.println(object);


		//object.remove(12);
		//System.out.println(object);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms"); 
	}

}

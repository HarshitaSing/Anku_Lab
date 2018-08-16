package com.anku.stack;
import java.util.ArrayList;
import java.util.Vector;

public class ArrayListProg
{

	public static void main(String[] args) {
	
		ArrayList<Integer> val= new ArrayList<>();
		
		//System.out.println(val.size());
		val.add(7);
		val.add(24);
		val.add(8);
		val.add(12);
		val.add(75);
		val.add(15);
		val.add(9);
		
		for(int i:val)
		{
			System.out.println(i);
		}
		//System.out.println(val.size());

		System.out.println("val is :" + val.get(3));
		
		//Vector<Integer> val1 = new Vector<>();
		
		//System.out.println(val1.capacity());
	}

}

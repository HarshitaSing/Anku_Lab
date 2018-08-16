package com.anku.stack;

import java.util.Set;
import java.util.TreeSet;

public class SetProg {

	
	public static void main(String[] args) {
		
		
		Set<Integer> val =new TreeSet<>();
		//System.out.println(val.size());

		val.add(55);
		val.add(17);
		 val.add(17); /* Set Interface does not allow duplicate values ..... 
		   				no matter how many times u assign it will consider 
		     				it as one only*/
		val.add(71);
		val.add(29);
		val.add(34);
		//System.out.println(val.size());
		
		//val.remove(val);
		
	for(int i:val)
		{
			System.out.println(i);
		}
	}
}

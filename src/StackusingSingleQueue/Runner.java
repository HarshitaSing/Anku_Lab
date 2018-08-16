package StackusingSingleQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Runner {

	Queue<Integer> que = new LinkedList<Integer>();
	  
	void push(int val)
	{
		int size = que.size();
		que.add(val);
		
	    for(int i=0;i<size;i++)
	   {
		 int x = que.remove();
		que.add(x);
	   }
	}
	
	void pop()
	{
		int x;
		if(que.isEmpty())
			System.out.println("no elements");
		
		x = que.remove();
		System.out.println("popped element : " + x);
	}
	
	int top()
	{
		if(que.isEmpty())
			return 0;
		
	  return que.peek();
		
	}
	
	 int show()
	{
		for(int i:que)
			System.out.print(i + " ");
	 return 0;
	}
	


}

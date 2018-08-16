package com.anku.stack;
import java.util.*;

public class StackMonksProb {
	
	static int stack[] = new int[100];
	static int top=-1;
	int C;
    static void push(int x)
    {
    	top=top+1;
    	stack[top] = x;	
    }
	
    static void pop(int temp)
    {
    	temp =stack[top];
    	System.out.println(temp);
    	top=top-1;
    	
    }
    
    static boolean isempty()
    {
    	if(top==-1)
    		return true;
    	else
    		return false;
    }
    
    static int size( )
    {
        return top + 1;
    }
	
	public static void main(String[] args) {
		
		int Q,q1,C;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of queries");
		Q=sc.nextInt();
		System.out.println("enter query");
		
		for(int i=0;i<=Q-1;i++)
		{
		q1= sc.nextInt();
		
		if(q1==1)
		{
			if(isempty())
				System.out.println("No Food");
			else
			{
				pop(top);
			}
		}
		
		if(q1==2)
		{
			C=sc.nextInt();
		 push(C);
		}
		}
		
		//System.out.println(size());
		
	}

}

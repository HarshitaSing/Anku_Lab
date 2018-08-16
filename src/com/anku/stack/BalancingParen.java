package com.anku.stack;
import java.util.*;

public class BalancingParen {
	
	private boolean checkParemtheses(String exp)
	{
		
	
		Stack <Character> stack= new Stack<Character>();
		 int n = exp.length(); 
	      
	      
	      for(int i = 0 ;i<=n-1;i++)
	      {
	    	  char ch = exp.charAt(i);
	         if((ch == '(') || (ch == '{') || (ch == '['))
	         {
	    	  stack.push(ch);
	         }
	         else if ((ch==')') || (ch == '}') || (ch == ']'))
	         {
	      	  // System.out.println("parentheses not matched");
	        	 if(stack.isEmpty())
	        	 {
	        		 return false;
	        	 }
	      	   		stack.pop();
	        	// return false;
	         }
	      }
	      
	       if(stack.isEmpty())
	       {
	    	   System.out.println("parentheses matched");

	    	 return true;
	       }
	       else	       
	    	   return false;
		
	
	}
		
	

	public static void main(String[] args) {
		
		BalancingParen bp= new BalancingParen();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your expression");
		
		String exp = scan.next();
		
		boolean isBalance =bp.checkParemtheses( exp);
		
		System.out.println("Entered expressioin is ::"+isBalance);

}
}

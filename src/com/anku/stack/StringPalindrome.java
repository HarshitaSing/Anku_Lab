package com.anku.stack;
import java.util.*;

public class StringPalindrome {

	public static void main(String[] args) {
		String str,revStr = "";
		int i,j,var;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		str=sc.next();
		var=str.length();
		
			for(j=var-1; j>=0 ; j--)
			{
				revStr = revStr + str.charAt(j);
				System.out.println(revStr);

			}
			if(revStr.equals(str))
				System.out.println("palindrome");
			else
				System.out.println("not palindrome");

		}

	}



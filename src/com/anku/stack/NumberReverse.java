package com.anku.stack;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,rev=0;
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the no.");
		num= sc.nextInt();
	    while(num!=0)
	    {
	    	rev = rev * 10;
	    	rev = rev + num % 10;
	    	num = num/10;
	    }
	    System.out.println(rev);
	}
}

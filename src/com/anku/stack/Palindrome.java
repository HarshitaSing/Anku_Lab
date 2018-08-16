package com.anku.stack;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		
		int num,num1,rem=0;
		int var=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no.");
		
		num = sc.nextInt();
		num1 = num;
		System.out.println(num);
		
		while(num != 0)
		{
			rem = num % 10;
            var = 10 * var + rem;
            num = num / 10;
    		System.out.println(num);

		}

		if(var == num1)
		{
			//System.out.println(var);

			System.out.println("Entered no. is palindrome" );
		}
		else
		{
			System.out.println("Entered no. is not palindrome" );

		}
	}

}

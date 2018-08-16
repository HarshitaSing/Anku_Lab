package com.anku.stack;

import java.util.Scanner;

public class ToggleCaseProg {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		String str = sc.nextLine();
		String t = "";
		
		for(int i = 0;i<str.length() ; i++)
		{
			 char c = str.charAt(i);
			if(c>=65 && c<=91)
				c = (char) (c + 32);
			else if(c>=97 && c<=123)
				c = (char) (c-32);
			t = t+c;
		}
		System.out.println(t);
	}

}



package com.anku.stack;

import java.io.*;

public class Pal {

	public static void main(String[] args) throws Exception {
		
		//Scanner sc = new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		int i,j,var;
		int n=Integer.parseInt(br.readLine());
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		for(i=0;i<=n-1;i++)
		{
		str=br.readLine();
		var=str.length();
		String revstr = "";
		for(j=var-1; j>=0 ; j--)
		{
			revstr = revstr + str.charAt(j);
			//System.out.println(revstr);
	
		}
		if(revstr.equals(str))
		{
		if(var%2==0)
		System.out.println("YES EVEN");
		else
		System.out.println("YES ODD");
		}
		else
		System.out.println("NO");
	}

}
}
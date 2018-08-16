package com.anku.stack;

import java.util.Scanner;

public class ArrayTranspose {

	public static void main(String[] args) {
		
		int[][] arr=new int[1000][1000]; 
		int[][] arr1=new int[1000][1000]; 

		int i,j,m,n;
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
		System.out.print(arr[i][j]);
		System.out.print(" ");
			}
			System.out.println(" ");

		}
		

		
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
		System.out.print(arr[j][i]);
		System.out.print(" ");

			}
		System.out.println(" ");
		}
		
	}

}

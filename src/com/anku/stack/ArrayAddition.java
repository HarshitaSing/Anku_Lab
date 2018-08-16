package com.anku.stack;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[100];
		int[] B = new int[100];
		int[] C = new int[100];
		int i,n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		for(i=0;i<=n-1;i++)
			A[i] = sc.nextInt();
		for(i=0;i<n-1;i++)
			B[i] = sc.nextInt();
		
		for(i=0;i<=n-1;i++)
			{
				C[i] = A[i] + B[i];
				
			}
		
		for(i=0;i<=n-1;i++)
		{
		System.out.print(C[i]);
		System.out.print(" ");

		}
	}

}

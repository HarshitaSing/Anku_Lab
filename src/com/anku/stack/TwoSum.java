package com.anku.stack;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= new int[10];
		int i,j,target=9;
		int n;
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the nos in array.");
		for(i=0;i<5;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<5;i++)
			for(j=i+1;j<=5;j++)
			{
				if(arr[j] == target-arr[i])
				{
					System.out.println(arr[i]);
				System.out.println(arr[j]);
				}

			}
	}

}

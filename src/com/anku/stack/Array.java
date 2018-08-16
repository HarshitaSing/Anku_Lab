package com.anku.stack;

import java.util.*;

class Array {
    public static void main(String args[] ) throws Exception {
       
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[100];
       int n,i;
       n = sc.nextInt();
        for(i = 0;i<n;i++)
            arr[i] = sc.nextInt();
        
        for(i=n-1; i >= 0 ;i--)
         System.out.println(arr[i]);

    }
}


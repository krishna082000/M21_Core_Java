package com.cg.array;

import java.util.Scanner;
public class RunTimeArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value : ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println("Enter "+ i+" value");
	    	arr[i]=s.nextInt();
	    }
	    for(int x:arr)
	    {
	    	System.out.println(x+" ");
	    }
		
		s.close();

	}

}

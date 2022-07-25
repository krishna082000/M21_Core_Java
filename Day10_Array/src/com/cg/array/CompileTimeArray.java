package com.cg.array;

public class CompileTimeArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		//System.out.println(arr[4]);
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		for(int i:arr)
		{
			System.out.println(i+" ");
		}

	}

}

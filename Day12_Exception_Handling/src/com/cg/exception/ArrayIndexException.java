package com.cg.exception;

public class ArrayIndexException {

	public static void main(String[] args) {
		System.out.println("First line");
        System.out.println("Second line");
        try
        {
        int[] myIntArray = new int[]{1, 2, 3};
        print(myIntArray);
        System.out.println("Third line");
        }
        catch(Exception e)
        {
        	System.out.println("Exception Handled"+e);
        }
    } 
    public static void print(int[] arr) {
        System.out.println(arr[3]);
        System.out.println("Fourth element successfully displayed!");
	}

}

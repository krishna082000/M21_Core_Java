package com.cg.exception;

import java.util.Scanner;

public class ArithmaticException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		try
		{
			int res=15/x;
			System.out.println(res);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		
		s.close();		
	}

}

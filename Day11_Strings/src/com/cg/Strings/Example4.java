package com.cg.Strings;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		String s1="Dhoni";
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(str.equals(s1))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not Matching");
		}

	}

}

package com.indiabix.repex;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "I can feel pain of java learners";
		String[] res = str.split("l");
		for(String i : res)
		{
			System.out.println(i);
		}
		s.close();
	}

}
package com.cg.Strings;

import java.util.StringTokenizer;

public class Example6 {

	public static void main(String[] args) {
		 StringTokenizer st = new StringTokenizer("I'm i innocent ?");
		 System.out.println(st.nextToken());
		 System.out.println(st.nextToken());
		 System.out.println(st.nextToken());
	}

}

package com.cg.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortSetExample {

	public static void main(String[] args) 
	{
		SortedSet <String>s=new TreeSet<String> ();
		s.add("abc");
		s.add("abhay");
		s.add("Abstract");
		s.add("pillow");
		
		System.out.println(s);

	}

}

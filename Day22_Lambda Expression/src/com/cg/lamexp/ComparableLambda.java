package com.cg.lamexp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparableLambda {

	public static void main(String[] args) {
		//Lambda Expression
		Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(),s2.length());
		String str[]= {"abc","Shivani","Shital"};
		Collections.sort(Arrays.asList(str),obj);
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		/*for(String i:str)
		{
			System.out.println(i);
		}*/
	}

}

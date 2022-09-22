package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) 
	{
		Set <Object> obj=new LinkedHashSet<>();
		obj.add("lambda");
		obj.add(14);
		obj.add(23.0);
		
		Object [] arr=obj.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println();
		for(Object itr:arr)
		{
			System.out.println(itr);
		}

	}

}

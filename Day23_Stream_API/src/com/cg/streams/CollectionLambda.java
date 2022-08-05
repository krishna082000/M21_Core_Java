package com.cg.streams;

import java.util.LinkedList;

public class CollectionLambda {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(11);
		obj.add(21);
		System.out.println(obj);
		//obj.forEach(i->system.out.println(i));
		obj.forEach(System.out::println);		
	}

}

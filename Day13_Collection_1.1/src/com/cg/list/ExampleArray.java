package com.cg.list;

import java.util.ArrayList;

public class ExampleArray {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("Krishna");
		obj.add(43);
		obj.add(222.88f);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains(43));
		System.out.println(obj.indexOf(222.88f));
		System.out.println(obj.lastIndexOf('g'));

	}

}

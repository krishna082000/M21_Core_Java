package com.cg.list;

import java.util.ArrayList;

public class CloneArrayList {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	
	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList();
		obj.add("Krishna");
		obj.add(15);
		obj.add(22.7f);
		System.out.println(obj);
		Object clonelist;//Shallow copy of Array List.
		clonelist=obj.clone();
		System.out.println(clonelist);
	
	}

}

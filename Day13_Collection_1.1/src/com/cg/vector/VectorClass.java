package com.cg.vector;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Object>v = new Vector<Object> ();
		v.add("Krishna");
		v.add(43);
		v.add(22.7f);
		v.add("kittya");
		System.out.println(v);
	}
}
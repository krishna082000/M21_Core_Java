package com.cg.list;
//declare arrayList from collection class
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
			List<Object>obj = new ArrayList<>();
			obj.add("Krishna");
			obj.add(22);
			obj.add(22.11);
			System.out.println("Array Elements are :" +obj);
	}

}

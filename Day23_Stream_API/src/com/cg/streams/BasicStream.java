package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		//stream can br created with static data
		Stream<String>obj=Stream.of("Sarthak","Sachin","Dnyanu");
		obj.forEach((i)->System.out.print(i+" "));
		System.out.println();
		//stream can be accquired from array or collections
		List<String>obj1=Arrays.asList(new String[]{"Mumbai","Pune","Latur"});
		obj=obj1.stream();
		//obj.forEach((i)->System.out.print(i));
		obj1.forEach(System.out::println);
		
		
	}

}

package com.cg.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) 
	{
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		
		map.put(6,"srishti");
		map.put(2,"shruti");
		map.put(10,"sneha");
		
		System.out.println(map);

	}

}

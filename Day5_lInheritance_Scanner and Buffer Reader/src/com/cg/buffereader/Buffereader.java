package com.cg.buffereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffereader {

	public static void main(String[] args) throws IOException {
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		String str=obj.readLine();
		System.out.println(str);

	}

}

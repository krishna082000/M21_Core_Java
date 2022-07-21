package com.cg.statickeyword;

public class StaticBlock {
	int num;
	String str;
	StaticBlock()
	{
		num=15;
		str="Krishna";
	}

	public static void main(String[] args) {
		StaticBlock s=new StaticBlock();
		System.out.println(s.num);
		System.out.println(s.str);

	}

}

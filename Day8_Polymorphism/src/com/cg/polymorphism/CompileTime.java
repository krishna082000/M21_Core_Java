package com.cg.polymorphism;
class A
{
	//by having a different types of arguments
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
}

public class CompileTime {

	public static void main(String[] args) {
		A a=new A();
		a.add(5, 10);
		a.add(1.1f,5.2f);
		
	}

}

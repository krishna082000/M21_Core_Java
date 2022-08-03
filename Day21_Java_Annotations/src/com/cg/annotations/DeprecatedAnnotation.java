package com.cg.annotations;

class A
{
	//@Deprecated - it allows any elements no longer to be used
	@Deprecated
	 public void print()
	{
		System.out.println("welcome to c2tc ");
	}
}

public class DeprecatedAnnotation {

	public static void main(String[] args) {
		
		A a=new A();
		a.print();
	}

}

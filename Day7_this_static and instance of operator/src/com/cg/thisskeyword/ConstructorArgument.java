package com.cg.thisskeyword;
class A
{
	public int a;
	A(int a)
	{
		this.a=a;
	}
}

public class ConstructorArgument {

	public static void main(String[] args) {
		A obj=new A(5);
		System.out.println("The main value of a is: "+obj.a);

	}

}

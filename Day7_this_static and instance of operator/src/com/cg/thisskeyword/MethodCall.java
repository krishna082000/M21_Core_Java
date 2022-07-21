package com.cg.thisskeyword;
class B
{
	void print(B b)
	{
		System.out.println("Function is invoked");
	}
	void display()
	{
		print(this);
	}
}

public class MethodCall {

	public static void main(String[] args) {
		B b=new B();
		b.display();
	}

}

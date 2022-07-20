package com.cg.polymorphism;
//program on method overriding
//one class is not enough create two or more class
class Multiplication
{
	void accept(int a,int b)
	{
		System.out.println(a*b);
	}
}
class Mul extends Multiplication
{
	void accept(int x,int y)
	{
		System.out.println(x*y);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Multiplication m=new Multiplication();
		m.accept(11, 2);
		Mul m1=new Mul();
		m1.accept(11, 5);

	}

}

package com.cg.interfac;

interface infee
{
	void display();//by default abstract method
}
class Demo1 implements infee
{
	//provided the implementation for abstract method inside the demo class
	@Override
	public void display()
	{
		System.out.println("Interface");
	}
}
public class Main {

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.display();
	}

}

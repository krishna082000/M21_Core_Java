package com.cg.abs;

abstract class fruit
{
	//abstract method
	abstract void display();
}
class Apple extends fruit
{
	//provide implementation for abstract method
	void display()
	{
		  System.out.println("Apple is good for our brain");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		//we can't create obj for abstract class
		// Fruit f=new Fruit();
		fruit f=new Apple();
		//Apple f=new Apple();
		f.display();

	}

}

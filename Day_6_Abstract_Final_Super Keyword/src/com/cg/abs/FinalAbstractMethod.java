package com.cg.abs;
//we can't create any abstract class as final in java
//final abstract class car
abstract class Car
{
	abstract void dosplay();
}
class Audi extends Car
{
	void display()
	{
		System.out.println("Audi");
	}
}
public class FinalAbstractMethod {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.display();

	}

}

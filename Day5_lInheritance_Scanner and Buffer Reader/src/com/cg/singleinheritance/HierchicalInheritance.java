package com.cg.singleinheritance;

class Mobilebrand
{
	void displayName()
	{
		System.out.println("brand is mi ");
	}
}
class Mi7 extends Mobilebrand
{
	void display()
	{
		System.out.println("Redmi note 7 pro ");
	}
}
class Mi8 extends Mobilebrand
{
	void display()
	{
		System.out.println("Redmi note 8 pro ");
	}
}

public class HierchicalInheritance {

	public static void main(String[] args) {
		Mi7 m=new Mi7();
		m.display();
		m.displayName();
	}

}

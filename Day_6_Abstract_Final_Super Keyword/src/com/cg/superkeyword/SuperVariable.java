package com.cg.superkeyword;

class Mobile
{
	protected String name="Mi";
}
class Mi extends Mobile
{
	String name="7 pro";
	void display()
	{
		  System.out.println(name);
		  System.out.println(super.name);
	}
}
public class SuperVariable {

	public static void main(String[] args) 
	{
		Mi s=new Mi();
		s.display();

	}

}

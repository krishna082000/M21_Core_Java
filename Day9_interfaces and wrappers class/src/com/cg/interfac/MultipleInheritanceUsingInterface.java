package com.cg.interfac;

interface Mother
{
	void print();
}
interface Father
{
	void display();
}
class Daughter implements Mother,Father
{
	public void print()
	{
		System.out.println("My mother name is Sunanda");
	}
	public void display()
	{
		System.out.println("My Father Name is Balaji");
	}
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
	Daughter d=new Daughter();
	d.print();
	d.display();

	}

}

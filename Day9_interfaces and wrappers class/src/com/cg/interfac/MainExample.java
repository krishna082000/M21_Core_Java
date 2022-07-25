package com.cg.interfac;

interface Vehicle
{
	void engine();
}
interface Car extends Vehicle
{
	void speed();
}
class Bus implements Car
{
	public void engine()
	{
	System.out.println("petrol");
	}
	public void speed()
	{
		System.out.println("speed is 40km/hr");
	}
}
public class MainExample {

	public static void main(String[] args) {
		Bus b=new Bus();
		b.engine();
		b.speed();

	}

}

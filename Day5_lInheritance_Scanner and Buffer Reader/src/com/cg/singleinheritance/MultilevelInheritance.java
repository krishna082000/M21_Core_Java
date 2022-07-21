package com.cg.singleinheritance;

class Car
{
	void CarType()
	{
		System.out.println("engine is on petrol ");
	}
}
class Renault extends Car
{
	public String brand="Renault";
	void brand()
	{
		System.out.println("Brand is : "+brand);
	}
}
class KWID extends Renault
{
	public int speed=50;
	void average()
	{
		System.out.println("The average speed in:"+speed+"km/hr");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		KWID k=new KWID();
		k.average();
		k.brand();
		k.CarType();

	}

}

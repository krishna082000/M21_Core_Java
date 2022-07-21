package com.cg.singleinheritance;

class Bike
{
	public int speed=50;
	void speed()
	{
		System.out.println("the speed of bike is: "+speed+"km/hr");
	}
}

class Pulser extends Bike
{
	void average()
	{
		System.out.println("Good");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Pulser p=new Pulser();
		p.speed();
		p.average();

	}

}

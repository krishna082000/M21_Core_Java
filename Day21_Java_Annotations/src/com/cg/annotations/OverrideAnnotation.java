package com.cg.annotations;
//@Override annotation is giving extra information about the method
class Car
{
	void speed(int s)
	{
		System.out.println("speed is : "+s+"km/hr");
	}
}
class BMW extends Car
{
	@Override
	void speed(int s)
	{
		System.out.println("speed is : "+s+"km/hr");
	}
}
public class OverrideAnnotation {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.speed(60);

	}

}

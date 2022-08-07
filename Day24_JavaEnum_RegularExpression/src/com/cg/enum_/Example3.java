package com.cg.enum_;

enum Bike
{
	Ktm,Pulsar,R15,CBZ
}

public class Example3 {

	public static void main(String[] args) {
		Bike b = Bike.Ktm;
		switch(b)
		{
		case Pulsar:
			System.out.println("You choose Pulsar");
			break;
		case Ktm:
			System.out.println("You choose KTM");
			break;
		case R15:
			System.out.println("You choose R15");
			break;
		case CBZ:
			System.out.println("You choose CBZ");
			break;
			
		default:
			System.out.println("Invalid Case");
		}
	}

}

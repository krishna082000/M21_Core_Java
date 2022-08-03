package com.cg.annotations;
class Animal
{
	Animal()
	{
		System.out.println("Lion");
	}
}

public class SuppressWarnings {

	public static void main(String[] args) {
		
		@java.lang.SuppressWarnings("unused")
		Animal a=new Animal();
	}

}

package com.cg.lamexp;
//Functional interface
interface A
{
	//Zero parameter abstract methode
	void show();
}

/*class B implements A
{

	@Override
	public void show() {
		System.out.println("program on implement Functional interface using lambda expression");
		
	}
	
}*/
public class FunctionalInterface {

	public static void main(String[] args) {
		//B b=new B();
		//b.show();
		A obj=()->
		{
			System.out.println("program on to implement Functional interface using lambda expression");	
		};
		obj.show();

	}

}

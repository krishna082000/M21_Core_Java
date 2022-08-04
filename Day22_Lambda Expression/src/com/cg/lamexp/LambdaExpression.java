package com.cg.lamexp;

//Functional Interface

interface C
{
	int add(int a,int b);
}
public class LambdaExpression {

	public static void main(String[] args) {
		//lambda expression without returning a value
		C obj=(int a,int b)->(a*b);
		System.out.println("Multiplication of a and b is : "+obj.add(12, 2));

	}

}

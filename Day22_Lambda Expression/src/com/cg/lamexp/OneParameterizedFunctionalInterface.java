package com.cg.lamexp;
//Functional Interface

interface B
{
	String print(String str);
}
public class OneParameterizedFunctionalInterface {

	public static void main(String[] args)
	{
		B obj=(String str)->
		{
			
			return str;
		};
		System.out.println(obj.print(" Lambda Expression"));
	}

}

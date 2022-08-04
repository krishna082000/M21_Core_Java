package com.cg.lamexp;
//Functional Interface

interface Z
{
	String show(String str1,String str2);
}

public class TwoParameterizedFunctionalInterface {

	public static void main(String[] args) {
		
		{
			Z obj=(String str1,String str2) ->
			{
				//concat the two string
				return str1+str2;
			};
			System.out.println(obj.show(" Lambda Expression","Easy"));
		}
	}
	

}

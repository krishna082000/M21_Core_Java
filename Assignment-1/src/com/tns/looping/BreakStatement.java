package com.tns.looping;

public class BreakStatement {

	public static void main(String[] args) 
	{
		int i;
		for(i=1;i<=20;i++)
		{
			if(i==15)
			{
				break;
			}
			System.out.println(i);
		}

	}

}

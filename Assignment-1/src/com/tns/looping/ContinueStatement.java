package com.tns.looping;

public class ContinueStatement {

	public static void main(String[] args) 
	{
		int i;
		for(i=2;i<=22;i++)
		{
			if(i==12)
				continue;

			
			System.out.println(i);
		}
	}

}

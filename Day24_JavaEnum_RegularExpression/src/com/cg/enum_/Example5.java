package com.cg.enum_;

public class Example5 {
	enum EmpType
	{
		contract,permenant,temporary;
	}
	static void print(EmpType e)
	{
		if(e==EmpType.contract)
		{
			System.out.println("Employee is Contract Based");
		}
		else if(e==EmpType.permenant)
		{
			System.out.println("Employee is permenant");
		}
		else if (e==EmpType.temporary)
		{
			System.out.println("Employee type is Temporary");
		}
	}

	public static void main(String[] args) {
		EmpType e=EmpType.permenant;
		print(e);
	}

}

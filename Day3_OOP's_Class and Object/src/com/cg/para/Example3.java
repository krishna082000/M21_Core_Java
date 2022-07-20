package com.cg.para;
class C
{
	int rollno;
	String name;
	C(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void print()
	{
		System.out.println("Roll No is:"+rollno+" and name is :"+name);
	}
}
public class Example3 {

	public static void main(String[] args) {
		C obj=new C(11,"Krishna");
		C obj1=new C(12,"xyz");
		obj.print();
		obj1.print();
	}

}

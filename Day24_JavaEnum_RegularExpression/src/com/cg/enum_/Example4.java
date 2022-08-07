package com.cg.enum_;

interface pizza
{
	void display();
}
enum size implements pizza
{
	small,medium,large,extraLarge;
	public void display()
	{
		System.out.println("size is : "+this);
	}
}
public class Example4 {

	public static void main(String[] args) {
		size.extraLarge.display();

	}

}

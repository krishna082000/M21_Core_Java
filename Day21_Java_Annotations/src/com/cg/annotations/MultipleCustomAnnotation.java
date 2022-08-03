package com.cg.annotations;
import java.lang.reflect.Method;
import java.lang.annotation.*; 
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//Custom Annotation

@interface Custo
{
	//abstract method
	//Multi-value annotation
	String print() default"Krishna";
	int speed() default 5;
	float percentage() default 9.8f;
}
class B
{
	@Custo (print="Hello Students",speed = 70, percentage = 64.71f)
	public void display()
	{
		System.out.println(" Hurrah! It's Holiday ");
	}
}
public class MultipleCustomAnnotation {

	public static void main(String[] args)throws NoSuchMethodException, SecurityException {
		B b=new B();
		b.display();
		Method m = b.getClass().getMethod("display");
		Custo obj = m.getAnnotation(Custo.class);
		
		System.out.println(obj.print());
		System.out.println(obj.speed());
		System.out.println(obj.percentage());

	}

}

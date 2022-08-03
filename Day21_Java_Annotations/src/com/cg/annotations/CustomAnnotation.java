package com.cg.annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.lang.annotation.*; 
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
@interface OwnCustom
{
	//abstract method
	int accept();
}
class C
{
	@OwnCustom (accept = 2208)
	public void display()
	{
		System.out.println(" Enjoy It's Holiday ");
	}
}
public class CustomAnnotation {

	public static void main(String[] args)throws NoSuchMethodException, SecurityException  {
		C b=new C();
		Method m = b.getClass().getMethod("display");
		OwnCustom obj = m.getAnnotation(OwnCustom.class);
		System.out.println(obj.accept());
		

	}

}

package com.cg.multithreading;
public class Example extends Thread
{

		public void run()
		{
			System.out.println("Thread is running");
		}

	public static void main(String[] args) {
		{
			Example t=new Example ();
			t.start();

		}
	}

}

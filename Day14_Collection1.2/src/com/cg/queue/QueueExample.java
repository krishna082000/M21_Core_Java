package com.cg.queue;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) 
	{
		PriorityQueue <Integer> q=new PriorityQueue<>();
		q.add(23);
		q.add(67);
		
		System.out.println(q);
		PriorityQueue <Object> q1=new PriorityQueue<>();
		q1.add(34);
		
		System.out.println(q1);

	}

}

package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueIteratorExample {

	public static void main(String[] args) 
	{
		Queue<Integer> q=new ArrayDeque<>();
		
		for(int i=10;i<15;i++)
		{
			q.add(i);
			
		}
		System.out.println(q);
		// Iterator as can you use for the iterating purpose:

		boolean isadded=q.offer(25);
		System.out.println("Isadded:"+isadded);
		System.out.println(q);
		Iterator<Integer>itr=q.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}

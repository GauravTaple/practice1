package com.reldyn.collection_framework.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Queue_example {
	public static void main(String[] args) {
		PriorityQueue<Integer> i = new PriorityQueue<Integer>();
		i.add(50);
		i.add(60);
		i.add(70);
		System.out.println(i);
		System.out.println(i.getClass());
		i.offer(20);
		System.out.println(i);
		i.offer(100);
		System.out.println(i);

		System.out.println(i.peek());
		
		System.out.println(i.poll());
		
		System.out.println(i.remove());
		System.out.println("--------------------------------------------");
		
		Deque<String> q=new LinkedList<String>();
		q.offer("gk");
		q.offer("kf");
		q.offerFirst("lm");
		q.offerLast("mn");
		System.out.println(q);
		q.forEach(t->System.out.println(t));
		System.out.println(q.peek()); // it only retrieve does not remove
		System.out.println(q.poll()); //retrieve and removes the head
		System.out.println(q.peek());
		
		q.push("jm");      //push in stack add element in first
		System.out.println(q);
		
		
		System.out.println(q.getLast());
		System.out.println(q.getFirst());

	}

}

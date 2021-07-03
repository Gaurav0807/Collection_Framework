package com.List.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Queue;

public class Learn_ArrayDeque {
	
	public static void main(String[] args) {
	
		ArrayDeque<Integer> p = new ArrayDeque<>();
		
		//we can also implement Stack using ArrayDeque
		//all method work we use pollLast Method in this only
		
		
		//offerFirst() and offerLast() unique ethod to add the element
		//in the last and first in ArrayDeque
		p.offer(1);
		p.offerFirst(44);
		
		p.offerLast(55);
		p.offer(4);
		
		System.out.println(p);
		
		
		System.out.println("Peek");
		
		System.out.println(p.peek());
		System.out.println(p.peekFirst());
		System.out.println(p.peekLast());
		
		System.out.println("Poll");
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p.pollFirst());
		System.out.println(p.pollLast());
	}

}

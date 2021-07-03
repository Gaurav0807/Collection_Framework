package com.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
	
	public static void main(String[] args) {
		
		Queue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
		
		
		//Comparator.reverseOrder -> convert max to min
		p.offer(12);
		p.offer(15);
		p.offer(1);
		
		System.out.println(p);
		
		p.poll();
		
		System.out.println(p);
		
		System.out.println(p.peek());
		
		
		
	}

}

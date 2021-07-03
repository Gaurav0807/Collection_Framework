package com.List.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack_and_Queue {
	
	public static void main(String[] args) {
		Deque<String> s = new ArrayDeque<String>();
		Deque<String> q = new ArrayDeque<String>();
		
		//Stack
		s.push("cat");
		s.push("dog");
		s.push("frog");
		s.push("lion");
		s.push("human");
		s.push("fox");
		
		while(!s.isEmpty())
		{
			System.out.print(s.pop()+" ");
		}
		
		
		//Queue
		System.out.println();
		
		
		q.add("cat");
		q.add("dog");
		q.add("frog");
		q.add("lion");
		q.add("human");
		q.add("fox");
		while(!q.isEmpty())
		{
			System.out.print(q.remove()+" ");
		}
		
		
		
	}

}

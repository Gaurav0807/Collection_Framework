package com.List;

import java.util.Stack;
import java.util.List;
public class Stack_ {
	public static void main(String[] args) {
		
		//Stack work as LIFO(Last in First Out)
		Stack<String> a = new Stack<>();
		a.push("cat");
		a.push("horse");
		a.push("dog");
		a.push("rat");
		
		System.out.println(a);
		
		//Peek give last element that is rat
		System.out.println("Peek Element:-"+a.peek());
		
		a.pop();
		System.out.println("Peek Element:-"+a.peek());

		
	}

}

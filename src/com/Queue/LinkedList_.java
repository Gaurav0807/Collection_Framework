package com.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_ {
	public static void main(String[] args) {
		//Queue is implemented by arraylist,linkedlist,priorityqueue
		//Queue is interface
		//Queue work as FIFO
		Queue<Integer> q = new LinkedList<>();
		
		//add element
		q.offer(1);
		q.offer(2);
		q.offer(3);
		System.out.println(q);
		
		//remove element
		System.out.println(q.poll());
		
		//peek tell which element will pop next
		System.out.println(q.peek());
		System.out.println(q);
		
		
//we can also use q.add(2) and q.remove(element) they both will work but if they it is not succesfully add or remove thar=t element then it through exception
		
		//now if we want to use arrayList with linkredlist
		//then we just simple make change
		//List<String> a = new LinkedList();
		
	}

}

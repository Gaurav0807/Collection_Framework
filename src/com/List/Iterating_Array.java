package com.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterating_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList();
		l.add("abc");
		l.add("def");
		l.add("ghi");
		
		System.out.println(l);
		
		
		//For Loop
		for(int i=0;i<l.size();i++)
		{
			System.out.println("Elements are:-"+l.get(i));
		}
		
		System.out.println("For Loop");
		//ForEach Loop
		for(String element:l)
		{
			
			System.out.println("Element are:-"+element);
		}
		
		
		//Iterator
		System.out.println("Iterator");
		Iterator<String> it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}

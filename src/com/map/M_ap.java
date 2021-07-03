package com.map;

import java.util.HashMap;
import java.util.Map;

public class M_ap {
	public static void main(String[] args) {
		
		Map<String,Integer> m = new HashMap<>();
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put("five", 5);
		
		//If duplicate key then it override on previous key value pair
		//m.put("two", 4);
	
		//methods
		/*
		if(!m.containsKey("two"))
		{
			m.put("two", 5);
		}
		
		
		
		m.putIfAbsent("two", 5);
		*/
		System.out.println(m.containsValue(7));
		System.out.println(m.isEmpty());
		System.out.println(m);
		for(Map.Entry<String,Integer> e:m.entrySet())
		{
			System.err.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		//for Printing Keys
		System.out.println("Keys");
		for(String key:m.keySet())
		{
			System.out.println(key);
		}
		
		//for Printing Values
		System.out.println("Values");
		for(Integer i:m.values())
		{
			System.out.println(i);
		}
		
		
		
	}

}

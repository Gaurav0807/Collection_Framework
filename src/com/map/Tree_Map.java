package com.map;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		Map<String,Integer> m = new TreeMap<>();
		//TreeMap sorted on the bases of keys but HashMap is not sorted
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put("five", 5);
		System.out.println(m);
		//five because in alphabetic order f come first 
		//then o comes then T comes
		//In this all operation are logn  and in HashMap all operation are 
		//in O(1)
		
		
		
		
	}
}

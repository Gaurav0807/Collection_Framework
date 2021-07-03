package com.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash_Set {
	
	public static void main(String[] args) 
	{
		
		Set<Student> s = new HashSet<>();
		s.add(new Student("Gaurav",1));
		s.add(new Student("Deepak",2));
		s.add(new Student("Hardik",3));
		
		s.add(new Student("Shivam",1));
		//Here both shivam and Gaurav both are stored in the hashSet 
		//because in this both are different object.
		
		System.out.println(s);
		
		
		
		
		//element are unordered and no duplication
		//Set<Integer> s = new HashSet<>();
		
		
		//Set<Integer> s = new LinkedHashSet<>();
		//In LinkedHashSet element are ordered means jissa order main 
		//element insert kre haii ussi ordered maii ayge but in hashset 
		//element are unordered
		
		//Set<Integer> s = new TreeSet<>();
		//In Tree Set first no duplicate and second it follow the property of
		//binary tree and element are ordered in this all function 
		//are in o(logn) but in hashSet all function are in O(n)
		
//		s.add(9);
//		s.add(90);
//		s.add(88);
//		s.add(44);
//		s.add(6);
//		s.add(44);
//		System.out.println(s);
//		s.remove(44);
//		System.out.println(s);
//		
//		System.out.println(s.contains(88));
//		
//		System.out.println(s.isEmpty());
//		  
//		System.out.println(s.size());
//		
//		s.clear();
//		
//		System.out.println(s);
		
	}

}

package com.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass {
	public static void main(String[] args)
	{
		List<Student> l = new ArrayList<>();
		l.add(new Student("Gaurav",10));
		l.add(new Student("Ankit",22));
		l.add(new Student("Neeraj",3));
		l.add(new Student("Nikka",3));
		System.out.println("Unsorted array");
		System.out.println(l);
		
		
		Student s1 = new Student("Gaurav",2);
		Student s2 = new Student("asdfghj",4);
		System.out.println(s1.compareTo(s2));
		
		Collections.sort(l,new Comparator<Student>() {
			@Override
			public int compare(Student o1,Student o2)
			{
				return o1.name.compareTo(o2.name);
			}
		});
		
		System.out.println("Sorted array");
		System.out.println(l);
		
//		l.add(33);
//		l.add(2);
//		l.add(90);
//		l.add(10);
//		
//		System.out.println(l);
//		System.out.println("Min Element :- "+Collections.min(l));
//		System.out.println("Max Element :- "+Collections.max(l));
//		
//		Collections.sort(l,Comparator.reverseOrder());
//		System.out.println(l);
		
	}

}
  
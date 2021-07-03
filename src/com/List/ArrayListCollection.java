package com.List;
import java.util.*;

public class ArrayListCollection {
	public static void main(String[] args) {
		
		List<String> a = new ArrayList();
		//List<String> a = new LinkedList();  // same work no need to change other function
		//Add the element at the end
		a.add("ahgjk");
		a.add("bghjk");
		a.add("ccthjk");
		System.out.println(a);
		
		//add the element based on index
		//a.add(index,Input);
		a.add(2,"Gaurav");
		System.out.println(a);
		
		List<String> b = new ArrayList();
		b.add("Rawat");
		b.add("dfghj");
		
		a.addAll(b); //add list to another list
		System.out.println(a);
	
		
		//Get the element of array
		System.out.println(a.get(2));
		
		
		//Remove Element By index
		a.remove(1);
		System.out.println(a);
		
		//Remove Element By value
		a.remove(String.valueOf("Gaurav"));
		System.out.println(a);
		
		//Clear whole List
		//a.clear();
		//System.out.println(a);
		
		
		//Set the element in the array
		a.set(1, "Hyy");
		System.out.println(a);
		
		//check if element exists or not
		System.out.println(a.contains("Hyyrtyu"));
		
	}

}

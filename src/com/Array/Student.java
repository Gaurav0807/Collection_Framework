package com.Array;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	 String name;
	 int rollno;
	public Student(String name, int i) {
		super();
		this.name = name;
		this.rollno = i;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
	
	
	@Override
	public boolean equals(Object o)
	{
		if(this == o)
			return true;
		if(o==null || getClass()!=o.getClass())
			return false;
		Student s =(Student) o;
		return rollno == s.rollno;
			
	}
	
	
	//generate hashcode
	@Override
	public int hashCode()
	{
		return Objects.hash(rollno);
	}


	//compareTo mai hum only ek cheeza compare ker skte haii
	//then we have Comparator Interface
	
	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return this.rollno-that.rollno;
	}
	
	
	
	
	
	
	

}

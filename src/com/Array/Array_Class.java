package com.Array;

import java.util.Arrays;

public class Array_Class {
	public static void main(String[] args) 
	{
		//Array Class is used over array
		//line int arr[]
		
		int[] num= {100,2,35,4,56,6,7,8,9,10};
		//int index = Arrays.binarySearch(num, 9);
		//System.out.println("Index of the element 9 is"+index);
		
		
		
		Arrays.sort(num);
		Arrays.fill(num, 9);
		for(int i:num)
		{
			System.out.println(i);
		}
	}

}

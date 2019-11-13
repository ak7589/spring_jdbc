package com.pluralsight.corejava;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi Amit, Welcome to core java...");
		int[] arr1 = {11,22,33,44	};
		
		System.out.println("Array Length is : " + arr1.length);
		
		//for loop to print elements in array
		for(int tmp : arr1) {
			System.out.println(tmp);
		}
		
		//Try to replace value in  the array 
		swap1 (arr1[0], 5);
		
		System.out.println("----------Print Array Again-------------------");
		
		for(int tmp : arr1) {
			System.out.println(tmp);
		}
		
		
		swap2 (arr1, 5);
		
		System.out.println("----------Print Array Again 3rd times-------------------");
		
		for(int tmp : arr1) {
			System.out.println(tmp);
		}
		
 }
	
	public static void swap1(int v1, int v2)
	{
		
		v1 = v2 ;
		
	}
	
	
	public static void swap2(int[] v1, int v2)
	{
		
		v1[0] = v2 ;
		
	}
}

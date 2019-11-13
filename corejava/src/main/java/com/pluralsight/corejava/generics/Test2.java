package com.pluralsight.corejava.generics;

import java.util.ArrayList;

/*
 * Below is the example of ArrayList which is using parameterized types
 * and because of that program is safe. Look at the code place where we 
 * are defining ArraList and see that we are passing data type as Integer
 * in the parameterized type parameter.
 
 * */

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Amit, Welcome to core Java...");
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		//arr.add("Amit");
		arr.add(4);
		arr.add(5);
		
		Test2.printDouble(arr);

	}
	
	private static void printDouble(ArrayList<Integer> arr) {
		
		//for (Integer o : arr) {
		for (int o : arr) {
			
			System.out.println(o * 2);
		}
	}

}

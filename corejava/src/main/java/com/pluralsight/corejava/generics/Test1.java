package com.pluralsight.corejava.generics;

import java.util.ArrayList;

/*
 * Below is the example of ArrayList which is not using parameterized types
 * and because of that program is risky. Look at the code place where we 
 * are defining ArraList and see that we have not given any parameterized
 *  type 
 * 
 * */

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Amit, Welcome to core Java...");
		
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add("Amit");
		arr.add(4);
		arr.add(5);
		
		printDouble(arr);

	}
	
	public static void printDouble(ArrayList arr) {
		
		for (Object o : arr) {
			
			System.out.println((Integer) o * 2);
		}
	}

}

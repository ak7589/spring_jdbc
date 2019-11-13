package com.pluralsight.corejava.collections;

import java.util.Arrays;
import java.util.List;

public class prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi Amit, Welcome to core java...");
		
		int s=0;
		List<Integer> ints = Arrays.asList(1,2,3);
		
		for (int n : ints) {
			
			s += n;
		}
		
		System.out.println("Value of S is : " + s);
		
		
		assert s == 7;
		
	}

}

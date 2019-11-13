package com.pluralsight.corejava.collections;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Amit...Welcome to core java....");
		
		List<String> list = new ArrayList<>();
		//assertTrue(list.isEmpty());
		
		System.out.println(list.isEmpty());
		
		//Another example
		List<String> list2 = new ArrayList<>(20);
		System.out.println(list2.isEmpty());
		

	}

}

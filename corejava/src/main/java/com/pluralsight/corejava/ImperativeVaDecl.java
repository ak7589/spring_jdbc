package com.pluralsight.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public  class ImperativeVaDecl {
	
	public static void findUnique() {
		System.out.println("Inside findUnique method...");
		
		List<Integer>integerList = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);
		//Print above list
		System.out.println("Printing originally defined - declared list : " + integerList);
		
		//Get an unique list from the duplicated list above
		List<Integer> uniqueList = new ArrayList<Integer>();
		
		//Loop to iterate over originally declared list
		for(Integer tmp : integerList) {
			
			if (!uniqueList.contains(tmp)) {
			
				uniqueList.add(tmp);
			}
			
		}
		//Print here the uniqueList and compare it with original sysout
		System.out.println("Printing unique list : " + uniqueList);
		
		//Now lets do the samething by declarative style using java 8 syntax
		List<Integer> uniqueList1 = integerList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Printing unique list1111, Using Java8 methods  : " + uniqueList1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Amit...Welcome to core java...");
		int sum =0;
		for(int i =0; i <=100 ; i++) {
			sum += i;
		}

		System.out.println("Sum of 1st 100 Numbers..." + sum);
		
		//Below is the declarative style of getting sum of 1st 100 numbers
		//Find the sum of first 100 numbers using declarati,ve style of programming
		IntStream stream  = IntStream.rangeClosed(0, 100);
				
		System.out.println("value of sum1 : " + stream.sum());
		
		//Call method
		ImperativeVaDecl.findUnique();
	}

}

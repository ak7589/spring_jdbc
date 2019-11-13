package com.test.arrays;

import java.util.Arrays;

public class ValueVsRefTypes {
	
	public static void main(String[] args) {
		System.out.println("Hi Anit, Welcome to core Java...");
		
		int intValue1 = 10;
		int intValue2 = intValue1;
		
		System.out.println("intValue1 : " + intValue1);
		System.out.println("intValue2 : " + intValue2);
		
		intValue2++;
		
		System.out.println("--------------------------------------");
		System.out.println("intValue1 : " + intValue1);
		System.out.println("intValue2 : " + intValue2);
		
		System.out.println("--------------------------------------");
		System.out.println("Same experiment we will do on array now");
		
		int[] myArray1 = new int[5];
		int[] myArray2 = myArray1;
		
		System.out.println("myArray1 Contents Are : " + Arrays.toString(myArray1));
		System.out.println("myArray2 Contents Are : " + Arrays.toString(myArray2));
		
		//Lets put values at some positions in the array
		myArray2[0] = 29;
		myArray2[1] = 41;
		myArray2[2] = 56;
		
		System.out.println("-------------After Putting Values-------------------------");
		System.out.println("myArray1 Contents Are : " + Arrays.toString(myArray1));
		System.out.println("myArray2 Contents Are : " + Arrays.toString(myArray2));
		
		//Before calling what happens if i assign myArray2 a new reference 
		myArray2 = new int [5];
		ValueVsRefTypes.modifyArray(myArray1);
		
		
		System.out.println("-------------After calling modifyArray method -------------------------");
		System.out.println("myArray1 Contents Are : " + Arrays.toString(myArray1));
		System.out.println("myArray2 Contents Are : " + Arrays.toString(myArray2));
		
		
	}
	
	//Method to modify array value
	private static void modifyArray(int[] array) {
		
		array[0] = 99;
		
		array = new int[5] ;
		return;
	}

}

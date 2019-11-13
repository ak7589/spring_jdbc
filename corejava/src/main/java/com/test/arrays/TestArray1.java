package com.test.arrays;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi Amit, Welcome to core Java...");
		
		//Method1 for declaring and initializing array in one go
		int[] intArray = {10,20,30,40,50};
		
		printArray(intArray);
		
		//Method2
		int[] intArray2 = new int[5];
		
		//Loop over length of array and populate value in it
		for (int j =0; j < intArray2.length; j++) {
			intArray2[j] = j * 100;
		}
		
		System.out.println("Printing intArray2 ....");
		//Loop through this integer array and print it
		printArray(intArray2);
		
		//Test for default values of integer array
		int[] intArray3 = new int[6];
		//int[] intArray3 ;
		System.out.println("Printing default int array...");
		printArray(intArray3);
	}

	private static void printArray(int[] intArray2) {
		for (int temp : intArray2) {
					
			System.out.println(temp);
		}
	}

}

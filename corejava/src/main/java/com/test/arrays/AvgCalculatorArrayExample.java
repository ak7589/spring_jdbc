package com.test.arrays;

import java.util.Scanner;

public class AvgCalculatorArrayExample {

	private static Scanner myScan = new Scanner(System.in);
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Amit, Welcome to core Java ...");
		
		//Define an int array and get inputs
		int[] intArray1 = AvgCalculatorArrayExample.readInput(5);
		
		//Print int array elements
		System.out.println("Printing Actual Array...");
		printArray(intArray1);
		
		System.out.println("Printing Sorted Array...");
		printArray(sortInDescendingOrder(intArray1));
		
		//Find average of entered numbers
		System.out.println("Avg Of Entered Numbers : " + calculateAvg(intArray1));
		
		//Call method to find minimum number in the Array
		//findMinValue
		System.out.println("Minimum Value in the Array  : " + findMinValue(intArray1));
		
		//Try reversing
		System.out.println("Try reversing the array ....");
		reverse(intArray1);
		printArray(intArray1);

	}
	
	//Reverse passed array
	private static void  reverse(int[] array) {
		
		int tmp=0;
		int arrayLen = array.length;
		int halfLen = array.length / 2;
		
		for (int i =0; i < array.length; i++) {
		
			if (i == halfLen) {
				break;
			}
			
			tmp = array[arrayLen-(i+1)];
			array[arrayLen-(i+1)] = array[i];
			array[i] = tmp;
		}
		
		return;
	}
	
	//Method to find least value in the integer array
	private static int findMinValue(int[] array) {
		
	
		boolean process = true;
		int minVal = array[0];
		while (process) {
			process = false;
			
			for(int j=1; j < array.length; j++) {
				if(minVal > array[j]) {
					
					minVal = array[j];
				}
			}
		}
		
		
		return minVal; 
	}
	
	//This method sorts array in descending order
	private static int[] sortInDescendingOrder(int[] inputArray) {
		
		//New array which will hold passed array
		int[] sortedArray = new int[inputArray.length];
		
		//This loop will copy passed array into the new array which will be sorted
		for(int i =0; i < inputArray.length; i++) {
			sortedArray[i] = inputArray[i];
		}
		
		boolean process = true;
		while (process) {
			process = false;
			
			for(int j = 0 ; j < sortedArray.length - 1; j++) {
				
				if(sortedArray[j] < sortedArray[j+1]) {
					
					int temp = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1] = temp;
					process = true;
					
				}
				
			}
		}
		
		return sortedArray;
	}
	
	//This method calculates average of numbers present in array
	private static double calculateAvg(int[] intArray1) {
		
		int sum = 0;
		
		for(int temp : intArray1) {
			
			sum = sum + temp;
		}
		
		double avg = (double) sum / (double) intArray1.length;
		
		return avg;
		
	}

	//This methods prints an array
	private static void printArray(int[] intArray1) {
		for(int temp : intArray1) {
			
			System.out.println(temp);
		}
	}
	
	//Write a method which will take input of let say fixed amount of integers and put it
	//in a integer array. Once all inputs are collected it returns int array to the caller
	
	private static int[] readInput(int noOfElements) {
		
		int[] intArray = new int[noOfElements];
		
		System.out.println("Enter Numbers : \n\r");
		
		for(int j =0; j < noOfElements ; j++) {
			
			intArray[j] = myScan.nextInt();
		}
		
		return intArray;
	}

}

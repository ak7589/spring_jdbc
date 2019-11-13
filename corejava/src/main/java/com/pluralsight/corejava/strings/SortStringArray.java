package com.pluralsight.corejava.strings;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] myArray = {"Bombay", "Pune", "Hyderabad", "Chandigarh", "Agra", "Allahabad"};
	      int size = myArray.length;

	      for(int i = 0; i<size-1; i++) {
	         for (int j = i+1; j<myArray.length; j++) {
	            if(myArray[i].compareTo(myArray[j])>0) {
	               String temp = myArray[i];
	               myArray[i] = myArray[j];
	               myArray[j] = temp;
	            }
	         }
	      }
	      System.out.println(Arrays.toString(myArray));

	}

}

package com.pluralsight.corejava;

import com.pluralsight.corejava.Months;

public class EnumDemo2 {

	public static void demoEnumUse(Months months) {
		System.out.println("Inside demoEnumUse method...");
		
		switch(months) {
		
		case Sep:
			System.out.println("This is Septemebr...");
			break;
		case Oct:
			System.out.println("This is October...");
			break;
		default:
			System.out.println("Invalid Month...");
			break;
				
			
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Amit, Welcome to core java again...");
		EnumDemo2.demoEnumUse(Months.Sep);
		EnumDemo2.demoEnumUse(Months.Jan);
		
		//Switch statement on enum containing months of a year
		/*
		 * switch(Months) {
		 * 
		 * }
		 */

	}

}

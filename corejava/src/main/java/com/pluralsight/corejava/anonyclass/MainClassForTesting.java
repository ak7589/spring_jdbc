package com.pluralsight.corejava.anonyclass;

public class MainClassForTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Amit...Welcome to MainClassForTesting for RND...");
		
		//Below is the example of anonymous class, which is created from 
		//the existing interface
		
		TestInterface test1 = new TestInterface() {
			
			@Override
			public void exampleMethod1() {
				System.out.println("Inside over-ridden method exampleMethod1..."
						+ "...Which is over-ridden in anonymous class ");	
			}
		};
		
		//Testing of calling method of anonymous class
		test1.exampleMethod1();

	}

}

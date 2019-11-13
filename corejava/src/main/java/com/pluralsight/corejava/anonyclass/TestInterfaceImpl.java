package com.pluralsight.corejava.anonyclass;

public class TestInterfaceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Amit, Welcome to core java again...");
		
		//Below is the example of creating instance of anonymous class from an interface
		TestInterface interface1 = new TestInterface() {
			
			@Override
			public void exampleMethod1() {
				System.out.println("Inside exampleMethod1 ....");
			}
		};
		
		//Now call method in this anonymous class
		interface1.exampleMethod1();
		
		//Now here is the example of creating anonymous classes from an existing class
		Book anonBook = new Book() {
			
			@Override
			public void printBook() {
				System.out.println("Design Pattern Book....");
			}
		};
		
		//Now call method of this anonym class created from an existing class
		anonBook.printBook();
	}

}

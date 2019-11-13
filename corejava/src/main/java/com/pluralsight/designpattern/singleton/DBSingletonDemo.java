package com.pluralsight.designpattern.singleton;

public class DBSingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi There...");
		
		DBSingleton dbInstance1 = DBSingleton.getInstance();
		
		System.out.println("dbInstance1 Address is : " + dbInstance1);
		
		
		DBSingleton dbInstance2 = DBSingleton.getInstance();
		
		System.out.println("dbInstance2 Address is : " + dbInstance2);

	}

}

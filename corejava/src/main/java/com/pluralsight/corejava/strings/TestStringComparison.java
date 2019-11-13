package com.pluralsight.corejava.strings;

public class TestStringComparison {
	
	public static void testMethod1() {
		
		// Declare and define Strings
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";

		// Test of String methods
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false
				
	}
	
	public static void testMethod2() {

		String s1 = "Sachin";
		String s2 = "SACHIN";

		System.out.println(s1.equals(s2));// false
		System.out.println(s1.equalsIgnoreCase(s2));// true

	}
	
	public static void testMethod3() {

		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)  

	}
	
	public static void testMethod4() {

		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 1(because s1>s3)
		System.out.println(s3.compareTo(s1));// -1(because s3 < s1 ) 

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi Amit, Welcome to core Java...");
		//TestStringComparison.testMethod1();
		//TestStringComparison.testMethod2();
		//TestStringComparison.testMethod3();
		TestStringComparison.testMethod4();
		

	}

}

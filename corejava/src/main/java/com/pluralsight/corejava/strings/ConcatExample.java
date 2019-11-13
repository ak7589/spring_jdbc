package com.pluralsight.corejava.strings;

public class ConcatExample {

	public static void testConcat1() {
		
		String s = 50 + 30 + "Anit" + 4 + 40;

		System.out.println(s);
	}
	
	public static void testConcat2() {

		String s1 = "Sachin ";
		String s2 = "Tendulkar";
		String s3 = s1.concat(s2);
		System.out.println(s3);// Sachin Tendulkar
		System.out.println(s1);// Sachin Tendulkar
	}
	
	public static void testConcat3() {

		String s = "SachinTendulkar";
		System.out.println(s.substring(6));// Tendulkar
		System.out.println(s.substring(0, 6));// Sachin  
	}
	
	public static void testConcat4() {

		String s="Sachin";  
		System.out.println(s.toUpperCase());//SACHIN  
		System.out.println(s.toLowerCase());//sachin  
		System.out.println(s);//Sachin(no change in original)  
		
		//New Test using trim method of String class
		String s1="                           Sachin                        ";  
		System.out.println(s1);//  Sachin    
		System.out.println(s1.trim());//Sachin  
		
		//startsWith and endsWith method example
		
		String s2 = "Sachin";
		System.out.println(s2.startsWith("Sa"));// true
		System.out.println(s2.endsWith("n"));// true 
		
		//charAt method test
		String s3="Sachin";  
		System.out.println(s3.charAt(0));//S  
		System.out.println(s3.charAt(3));//h 
		
		String s4="Sachin";  
		System.out.println(s4.length());//6
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ConcatExample.testConcat1();
		//ConcatExample.testConcat2();
		//ConcatExample.testConcat3();
		ConcatExample.testConcat4();
		
	}

}

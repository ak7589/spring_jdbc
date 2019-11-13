package com.pluralsight.corejava.strings;

public class CompareToStringExample {

	public static void main(String[] args) {
		
		String str_Sample = "a";
        System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("b"));
        
        str_Sample = "b";
        System.out.println("Compare To 'b' a is : " + str_Sample.compareTo("a"));
        
        str_Sample = "b";
        System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));
        
        
        str_Sample = "Pune";
        System.out.println("Comparison of Pune and Bombay is  : " + str_Sample.compareTo("Bombay"));
        
        str_Sample = "Pune1";
        System.out.println("Comparison of Pune1 and Pune2 is  : " + str_Sample.compareTo("Pune2"));
        
		
	}
	
}

package com.pluralsight.corejava.strings;

class Testimmutablestring {
	public static void main(String args[]) {
		String s = "Sachin";
		s.concat(" Tendulkar");// concat() method appends the string at the end
		System.out.println(s);// will print Sachin because strings are immutable objects
		
		System.out.println("Now lets see another output...");
		
		String str1 = "Amit";
		String str2 = str1.concat(" Kumar");
		
		System.out.println(str1);
		System.out.println(str2);
		
		
	}
}

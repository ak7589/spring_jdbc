package com.pluralsight.corejava.threads;

public class PrintCountries2 {

	public static String[] countries = {"India","USA","Russia","Canada", "Sri Lanka"};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Amit...Welcome to core java ....");
		
		for(String temp : countries) {
			//System.out.println("Hello " + temp + " !!! ");t
			
			Greet greet = new Greet(temp);
			//greet.run();
			greet.start();
			
		}

	}

}

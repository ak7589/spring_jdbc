package com.pluralsight.corejava.threads;

public class PrintCountries3 {

	public static String[] countries = {"India","USA","Russia","Canada", "Sri Lanka"};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Amit...Welcome to core java ....");
		
		for(String temp : countries) {
			//System.out.println("Hello " + temp + " !!! ");t
			
			Greet2 greet = new Greet2(temp);
			Thread th = new Thread(greet,temp + " thread");
			th.start();
			//greet.run();
			
		}

	}

}

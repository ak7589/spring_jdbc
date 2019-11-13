package com.pluralsight.designpattern.factory;

public class CreditCardFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside CreditCardFactoryDemo class ....");
		
		//Call Credit card Factory and print the class
		CreditCard card1 = CreditCardFactory.getCard(BankName.CITI);
		
		System.out.println(card1);
		
		
		CreditCard card2 = CreditCardFactory.getCard(BankName.ICICI);
		
		System.out.println(card2);
		

	}

}

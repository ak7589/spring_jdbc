package com.pluralsight.designpattern.factory.strategy;

public class VisaCardStrategy extends ValidationStrategy {
	
	@Override
	public boolean isValid(CreditCard card) {
		
		System.out.println("Validation of Visa Card...");
		
		return true;
	}

}

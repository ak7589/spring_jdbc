package com.pluralsight.designpattern.factory.strategy;

public abstract class ValidationStrategy {
	
	public boolean isValid(CreditCard card) {
		
		System.out.println("Default Validation code of Abstract base class...");
		
		return true;
	}

}

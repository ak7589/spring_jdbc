package com.pluralsight.designpattern.factory.strategy;

public class MasterCardStrategy extends ValidationStrategy {
	
	@Override
	public boolean isValid(CreditCard card) {
		
		System.out.println("Validation of Master Card...");
		
		return true;
	}

}

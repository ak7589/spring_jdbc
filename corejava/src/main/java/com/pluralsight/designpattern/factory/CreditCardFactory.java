package com.pluralsight.designpattern.factory;

public class CreditCardFactory {

	public static CreditCard getCard(BankName bankName) {
		
		CreditCard creditCard = null;
		
		switch(bankName) {
		
		case ICICI :
			creditCard = new ICICICreditCard();
			break;
			
		case CITI :
			creditCard = new CITICreditCard();
			break;
			
		default :
				break;
			
		}
		
		return creditCard;
	}
}

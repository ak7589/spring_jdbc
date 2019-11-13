package com.pluralsight.designpattern.factory;

public class CITICreditCard extends CreditCard {

	
	public CITICreditCard() {
		
		this.getCreditCard();
	}


	@Override
	public void getCreditCard() {
		// TODO Auto-generated method stub
		this.setCardName("CITI");
		return ;
	}
	
	@Override
	public String toString() {
		
		return this.getCardName();
	}

}

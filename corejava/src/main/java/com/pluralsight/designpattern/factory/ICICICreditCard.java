package com.pluralsight.designpattern.factory;

public class ICICICreditCard extends  CreditCard {

	public ICICICreditCard() {
		
		this.getCreditCard();
	}
	
	@Override
	public void getCreditCard() {
		// TODO Auto-generated method stub
		this.setCardName("ICICI");
		return ;
	}
	
	@Override
	public String toString() {
		
		return this.getCardName();
	}

}

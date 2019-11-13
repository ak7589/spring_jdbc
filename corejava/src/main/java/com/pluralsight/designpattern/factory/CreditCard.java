package com.pluralsight.designpattern.factory;

import java.util.Date;

public abstract class CreditCard {
	
	
	private String cardName;
	private String cardNumber;
	private Date expiryDate;

	public String getCardName() {
		return cardName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void getCreditCard() {
		
		return ;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}

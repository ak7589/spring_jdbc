package com.pluralsight.designpattern.factory.strategy;

public class CreditCard {
	
	//Attributes /  fields / class variables
	private String number;
	private String date;
	private String cvv;
	private ValidationStrategy validationStrategy;
	
	public CreditCard() {
		
	}
	
	public CreditCard(String number, String date, String cvv,ValidationStrategy validationStrategy) {
		super();
		this.number = number;
		this.date = date;
		this.cvv = cvv;
		this.validationStrategy = validationStrategy;
	}
	
	public boolean isCardValid() {
		
		return(validationStrategy.isValid(this));
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	};
	
	
	

}

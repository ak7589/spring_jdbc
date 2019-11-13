package com.pluralsight.corejava.threads;

public class Greet extends Thread {

	private String country;

	public Greet(String country) {
		super(country + " thread ");
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	 public void run() {
         
		long id = Thread.currentThread().getId();
		String threadName = Thread.currentThread().getName();
		
		 System.out.println("Thread Name : " + threadName +  " : Thread ID " + id);
     }
	
}

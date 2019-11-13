package com.pluralsight.corejava.threads;

import java.util.concurrent.TimeUnit;

public class Greet2 implements Runnable {

	private String country;

	public Greet2(String country) {
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
		 try {
			 //This is one method to put thread to sleep
			//Thread.currentThread().sleep(1000000);
			 
			 int val = 5000;
			 TimeUnit.MILLISECONDS.sleep(val);
			 
			 System.out.println("Thread Name : " + threadName +  " : Thread ID " + id + " : EXITING ");
			 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
     }
	
}

package com.pluralsight.corejava.threads.udemy;

public class AnotherThread extends Thread {
	
	@Override
	public void run() {
	
		System.out.println("Hello from " + Thread.currentThread().getName());
		
		try {
			System.out.println("Going to sleep for 3 Secs " + Thread.currentThread().getName());
			sleep(3000);
		}
		
		catch(InterruptedException e) {
			System.out.println("Another Thread waked me up EXITINGGGGGG..." + Thread.currentThread().getName());
			//return statement to make this thread stop or say exit
			return;
		}
		
		System.out.println("My 3Sec sleep over...Waking up" + Thread.currentThread().getName());
		
	}
	

}

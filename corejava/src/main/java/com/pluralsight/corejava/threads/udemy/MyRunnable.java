package com.pluralsight.corejava.threads.udemy;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello From " + Thread.currentThread().getName());
	}

}

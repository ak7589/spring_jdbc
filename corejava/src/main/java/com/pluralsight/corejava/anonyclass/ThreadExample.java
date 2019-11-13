package com.pluralsight.corejava.anonyclass;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Amit, Welcome to core java again...");
		
		
		//Conventional way of starting a thread
		Runnable myRunnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside run method of Runnable interface");
			}
		};
		
		Thread th1 = new Thread(myRunnable);
		th1.start();
		
		//Implement runnable interface using Lambda 
		Runnable runnableLambda = () -> {
			System.out.println("Sysouts from Lambda...");
		};
		
		//Now start thread using runnable interface implemented by Lambda
		new Thread(runnableLambda).start();
		
		
	}

}

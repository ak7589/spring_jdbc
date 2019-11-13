package com.pluralsight.corejava.threads.udemy;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from Main Thread...");
		
		AnotherThread anotherThread = new AnotherThread();
		anotherThread.setName("####Another-Thread####");
		anotherThread.start();
		
		//Define an anonymous class here
		new Thread() {
			
			@Override
			public void run() {
			
				System.out.println("Hello from  Anonymous Thread class...");
			}
			
		}.start();
		
		System.out.println("Hello Again from Main Thread...");
		
		/*
		 * //Now start a thread with the help of MyRunnable class which implements
		 * //Runnable interface MyRunnable myRunnable = new MyRunnable(); Thread th2 =
		 * new Thread(myRunnable); th2.setName("####Runnable Thread2#####");
		 * th2.start();
		 */
		
		Thread myRunnableThread = new Thread( new MyRunnable() {
			
			@Override
			public void run() {
				System.out.println("Hello From anonymous class implementation of run of MyRunnable");
				
				//Join another thread
				try {
					anotherThread.join();
					System.out.println("After Join method ---executing again from anonymous MyRunnable");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
				
				);
		
		myRunnableThread.start();
		
		//Now interrupt here the sleep thread and see the result
		//anotherThread.interrupt();
		//new Thread(myRunnable).start();
		
		//Try to find out what happens when you start thread again
		//anotherThread.start();

	}

}

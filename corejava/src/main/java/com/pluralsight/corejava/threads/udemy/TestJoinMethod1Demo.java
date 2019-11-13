package com.pluralsight.corejava.threads.udemy;

public class TestJoinMethod1Demo {

	public static void main(String args[]){  
		 
		TestJoinMethod1 t1=new TestJoinMethod1();  
		TestJoinMethod1 t2=new TestJoinMethod1();  
		TestJoinMethod1 t3=new TestJoinMethod1(); 
		
		t1.setName("#####Thread1#####");
		t2.setName("#####Thread2#####");
		t3.setName("#####Thread3#####");
		
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		} 
		
		System.out.println("Now going to start other 2 threads t2 and t3, thd name : " + Thread.currentThread().getName());
		
		 t2.start();  
		 t3.start();
		
	}  


}

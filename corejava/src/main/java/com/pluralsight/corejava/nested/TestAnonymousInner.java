package com.pluralsight.corejava.nested;

public class TestAnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs 
		
		System.out.println("Hi Amit, Testing anonymous inner class...");
		
		Person p = new Person() {
			
			void eat() {
				System.out.println("Testing......");
			}
		};
		
		p.eat();
	}

}

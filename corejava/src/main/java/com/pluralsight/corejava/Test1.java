package com.pluralsight.corejava;

public class Test1 {

	public static class parent {
		
		public  void print() {
			
			System.out.println("Parent static class in Test1");
		}
	}
	
	public static class child extends parent {
		
		//@Override
		public  void print() {
			
			System.out.println("child static class in Test1");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Amit, Welcome to core Java...");
		
		parent A = new parent();
		child B = new child();
		
		A.print();
		B.print();
		

	}

}

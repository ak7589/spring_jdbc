package com.pluralsight.corejava.nested;

public class TestMemberOuter1 {
	
	 private int data=30;
	 
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TestMemberOuter1 obj=new TestMemberOuter1();  
		  TestMemberOuter1.Inner in =obj.new Inner();  
		  in.msg();

	}

}

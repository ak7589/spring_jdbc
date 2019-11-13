package com.pluralsight.corejava.staticex;

public class StaticExamples {

	public static final String schoolName ;
	public static final int A = 99;
	public static final int B;
	
	static {
		
		{
			schoolName = "funAndFun";
			
			if(A == 99) {
				
				B = 399;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Amit, Welcome to core Java...");
		
		System.out.println(StaticExamples.schoolName);
		
		System.out.println("A : " + A + " , B : " + B);

	}

}

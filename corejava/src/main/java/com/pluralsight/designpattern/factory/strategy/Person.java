package com.pluralsight.designpattern.factory.strategy;

public class Person {
	
	//Attributes
	private String name;
	private int age;
	private String phoneNo;
	
	//Constructors
	
	public Person() {
		
	}
	
	public Person(String name, int age, String phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}

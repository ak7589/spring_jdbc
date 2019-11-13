package com.pluralsight.designpattern.factory.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEveryDayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi Amit, Welcome to core java...");
		
		List<Person> personList = new ArrayList<Person>();
		
		Person person1 = new Person("Amit",46,"9881104448");
		Person person2 = new Person("Venky",28,"9881106754");
		Person person3 = new Person("Rajesh",27,"9881106778");
		
		
		//Add above persons to the list
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		
		printContents(personList);
		
		//Sort list by age
		Collections.sort(personList,new Comparator<Person>() {

			@Override
			public int compare(Person arg0, Person arg1) {
				// TODO Auto-generated method stub
				int retval =0;
				
				if(arg0.getAge() > arg1.getAge()) {
					retval = 1;
				}
				else if(arg0.getAge() < arg1.getAge()) {
					retval = -1;
				}
				else 
				{
					retval =0;
				}
				
				return retval;

			}
			
		});
		
		System.out.println("Print object after sorting by age ...");
		printContents(personList);
		
		//Sort by Name now
		Collections.sort(personList,new Comparator<Person>() {

			@Override
			public int compare(Person arg0, Person arg1) {
				// TODO Auto-generated method stub
				
				return(arg0.getName().compareTo(arg1.getName()));

			}
			
		});
		
		System.out.println("Print object after sorting by Name ...");
		printContents(personList);

	}

	private static void printContents(List<Person> personList) {
		for(Person tmp : personList) {
			System.out.println("Name : " + tmp.getName() + " Age : " + tmp.getAge()
			+ " Phone : " + tmp.getPhoneNo());
		}
	}

}

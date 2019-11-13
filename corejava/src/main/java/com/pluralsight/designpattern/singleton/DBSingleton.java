package com.pluralsight.designpattern.singleton;

public class DBSingleton {
	
	public static DBSingleton dbInstance = null;
	
	//Private constructor
	private DBSingleton() {
		
	}
	
	//Method to return instance of this class
	public static DBSingleton getInstance() {
		
		if (dbInstance == null) {
			
			dbInstance = new DBSingleton();
			
		}
		return dbInstance;
	}

}

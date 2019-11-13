package com.pluralsight.corejava.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi Amit...Welcome to core Java...");
		
		 Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
		    String valTest1 = ht.put(101," ajay");
		    System.out.println("Value of valTest1 : " + valTest1);
	        String valTest2 = ht.put(101,"Vijay"); 
	        System.out.println("Value of valTest2 : " + valTest2);
	        ht.put(102,"Ravi"); 
	        ht.put(103,"Rahul"); 
	        System.out.println("-------------Hash table, Print Start--------------"); 
	        for (Map.Entry m : ht.entrySet()) { 
	            System.out.println(m.getKey()+" "+m.getValue()); 
	        } 
	        System.out.println("-------------Hash table, Print End--------------");
	        
	        //
	        HashMap<Integer,String> hmap=new HashMap<Integer,String>(); 
		    String valTest11 = hmap.put(101," ajay");
		    System.out.println("Value of valTest11 : " + valTest11);
	        String valTest12 = hmap.put(101,"Vijay"); 
	        System.out.println("Value of valTest12 : " + valTest12);
	        hmap.put(102,"Ravi"); 
	        hmap.put(103,"Rahul"); 
	        System.out.println("-------------Hash Map, Print Start--------------"); 
	        for (Map.Entry m : hmap.entrySet()) { 
	            System.out.println(m.getKey()+" "+m.getValue()); 
	        } 
	        System.out.println("-------------Hash Map, Print End--------------");
	        
	}

}

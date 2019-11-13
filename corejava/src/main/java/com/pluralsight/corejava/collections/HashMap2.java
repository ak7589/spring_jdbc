package com.pluralsight.corejava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Amit, Welcome to core java ...");
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		//Put entry's in the map
		hmap.put("Amit", 10000);
		hmap.put("Gunjan", 20000);
		hmap.put("Bharti", 30000);

		//Get a set view of map
		System.out.println("SET view of HashMap : " + hmap.entrySet());
		
		Set<Map.Entry<String,Integer>> st = hmap.entrySet();
		
		//for each loop to roam through collection of sets
		for(Map.Entry<String,Integer> x : st) {
			
			System.out.println(x.getKey() + " ::: " + x.getValue());
			System.out.println("==========================");
		}
		
		//Call getClass 
		HashMap2 hash2 = new HashMap2();
		System.out.println("Output of getClass() Method call---- : " + hash2.getClass());

	}
	
	
}

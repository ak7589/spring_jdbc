package com.pluralsight.corejava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void readFile() {
	
		System.out.println("Inside readFile method...");
		
		BufferedReader reader = null;
		int total =0;
		
		try {
			reader = new BufferedReader(new FileReader("C:\\dev\\abc.txt"));
			
			String sLine = null;
			while( (sLine=reader.readLine()) != null) {
				
				total += Integer.valueOf(sLine);
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		finally {
			
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Total :::" + total);
		
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int i = 12, j = 5;
       
        try {
        	
        	int k = i / (j-5);
        	System.out.println(k);
        	
        }
        catch(Exception e) {
        	
        	System.out.println("Exception occured, Error message is  : " + e.getMessage());
        	e.printStackTrace();
        	
        }
        
        //Call readFile method
        readFile();
    }
}

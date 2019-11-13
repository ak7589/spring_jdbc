package com.pluralsight.corejava;

public class FinalConceptDemo {
	
	 // a final variable 
    // direct initialize 
    final int THRESHOLD = 5; 
      
    // a blank final variable 
    final int CAPACITY; 
      
    // another blank final variable 
    final int  MINIMUM; 
      
    // a final static variable PI 
    // direct initialize 
    static final double PI = 3.141592653589793; 
      
    // a  blank final static  variable 
    static final double EULERCONSTANT; 
    
    //private var having getter and setters
    private int level;
    
    
      
    public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	// instance initializer block for  
    // initializing CAPACITY 
    { 
        CAPACITY = 25; 
    } 
      
    // static initializer block for  
    // initializing EULERCONSTANT 
    static{ 
        EULERCONSTANT = 2.3; 
    } 
      
    // constructor for initializing MINIMUM 
    // Note that if there are more than one 
    // constructor, you must initialize MINIMUM 
    // in them also 
    public FinalConceptDemo()  
    { 
        MINIMUM = -1; 
    } 
    
    //public method to print value of different variables defined in the class
    public void printVars() {
    	
    	System.out.println("THRESHOLD : " + THRESHOLD + " : CAPACITY : " 
    	+ CAPACITY + " : MINIMUM : " + MINIMUM + " : EULERCONSTANT : "
    			+ EULERCONSTANT + " : level : " + level);
    }
    
    public static void main(String args[]) {
    	
    	final FinalConceptDemo testVar = new FinalConceptDemo();
    	
    	testVar.printVars();
    	
    	//Set level to some different value
    	testVar.setLevel(99);
    	
    	testVar.printVars();
    	
    	//testVar = new FinalConceptDemo();
    }

}

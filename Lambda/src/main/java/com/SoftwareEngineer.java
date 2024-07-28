package com;
@FunctionalInterface
public interface SoftwareEngineer {
        String getmethods ();
      
    
     static void m1() {
    	 System.out.println("Static");
     }
    default void m2() {
    	 System.out.println("default");
     }
    
    default String  m3() {
    	
    	return "hello";
    }
    default void m() {
    	System.out.println("default");
    }
    public static void main(String []args) {
       System.out.println("hello");
       
		
		
     
    }


	


	
    }


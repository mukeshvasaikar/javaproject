package com.Exception;

public class Invalid_try_block {
    public static void main(String[]args) {
    	System.out.println("Application started ");
    	try
    	{
    		
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println(10/0);
    		
    	}
    
		System.out.println("Exception without try block:" );
    	
    }
	
	
}

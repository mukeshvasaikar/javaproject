package com.Exception;

public class Exceptionnot_match {
	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println(10/2);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("catch block will match the exception:" + e);
		}
		System.out.println("rest of the application");
	}
}

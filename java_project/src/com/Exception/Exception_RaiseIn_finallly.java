package com.Exception;

public class Exception_RaiseIn_finallly {
	public static void main(String[] args) {
		System.out.println("Application started");
		try {
			System.out.println("try block");
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("exception raise in try-catch block will be executed" + e);
			
		} finally {
			System.out.println("Finally block will executed");
			System.out.println("Mukesh".charAt(6));
			
		}
		System.out.println("Rest of the Application");
}
}
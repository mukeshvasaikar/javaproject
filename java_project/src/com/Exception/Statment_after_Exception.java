package com.Exception;

public class Statment_after_Exception {
	public static void main(String[] args) {
		System.out.println("Application started");

		try {
			System.out.println("Statement in the try block");
			System.out.println(10/0);
			System.out.println("will see what happend");
		}

		catch (ArithmeticException e) {
			System.out.println("catch block matche  the exception ");
		}

	}

}

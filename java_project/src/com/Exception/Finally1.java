package com.Exception;

public class Finally1 {
	public static void main(String[] args) {
		System.out.println("Applications started");
		try {
			System.out.println("try block");
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Catch block matche the exception:" + e);
			return;
		} finally {
			System.out.println("Finally block is executed");
		}
		System.out.println("Rest of the Application");
	}

}

package com.Exception;

public class Arithmatic {
	public static void main(String[] args) {
       System.out.println("main method started");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
                 System.out.println("catch block will be executed:"+e);
		}
           System.out.println("Rest of the application");
	}
}
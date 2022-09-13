package com.Exception;

public class Try_finally {
	public static void main(String[] args) {
		System.out.println("Application started");
		try {
			System.out.println("try block");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("Rest of the appliaction");
	}

}

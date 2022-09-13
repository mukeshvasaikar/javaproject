package com.Exception;

import java.util.Scanner;

public class Multi_catch {
	public static void main(String[] args) {
		try {
			Scanner scr = new Scanner(System.in);
			System.out.println("Enter a num:");
			int num = scr.nextInt();
			System.out.println(10/num);
			System.out.println("MUKESH".charAt(6));
		} catch (ArithmeticException e) {
			System.out.println("Exception raise in the try block:" + e);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception raise in the try block:" + e);
		}
		System.out.println("Rest of the apllication");
	}

}

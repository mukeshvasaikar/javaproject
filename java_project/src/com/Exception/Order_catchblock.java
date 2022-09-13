package com.Exception;

import java.util.Scanner;

public class Order_catchblock {
     
	public static void main(String[] args) {
		try {
		Scanner scn= new Scanner(System.in);
		System.out.println("Eneter a num:");
		int num = scn.nextInt();
		System.out.println(10/num);
		
		System.out.println("Enter an char index:");
		int charIndex= scn.nextInt();
		
		System.out.println("Enter an ArrayIndex");
		int arrIndex= scn.nextInt();
		
		System.out.println("mukesh".charAt(charIndex));
		int[] a= {10,20,30};
		System.out.println(a[arrIndex]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception raise in try block");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception raise in try block");
		}
		catch(Exception e)
		{
			System.out.println("Exception raise in try block");
		}
		System.out.println("Rest of the apllication");
	}
	
}

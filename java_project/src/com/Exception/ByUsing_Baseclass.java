package com.Exception;

import java.util.Scanner;

public class ByUsing_Baseclass {
	public static void main(String[]args) {
	try 
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a num:");
		int num = scn.nextInt();
		System.out.println(10/num);
		System.out.println("Mukesh".charAt(3));
	}
	catch(Exception e)
	{
		System.out.println("Exception raise in try block:"+e);
	}
	System.out.println("Rest of the apllications");
}
}
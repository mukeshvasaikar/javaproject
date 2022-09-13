package com.Exception;


import java.util.Scanner;



public class Pipe_Operator {
	
	int i=10;
	public static void main(String[] args) 
	{
		try
		{
			Scanner scn= new Scanner(System.in);
             System.out.println("Enter num");
			 int num = scn.nextInt();
			 System.out.println(10/num);
			 System.out.println("Mukesh".charAt(6));
			// System.out.println(t.i);
		}
		catch (ArithmeticException| NullPointerException | NumberFormatException  e)
		{
			System.out.println("Exception raise in try block:"+e);
		}
		catch(StringIndexOutOfBoundsException | ClassCastException e)
		{
		    System.out.println("Exception raise in try block");
		}
		System.out.println("rest of the application");
	}

}

package com.Exception;

public class Finally_not_executed {
	public static void main(String[] args) {
		System.out.println(10/0);
		try
		{
			System.out.println("try block");
		}
		catch(Exception e)
		{
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

}

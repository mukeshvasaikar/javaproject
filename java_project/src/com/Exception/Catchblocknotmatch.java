package com.Exception;

public class Catchblocknotmatch {
	public static void main(String[] args) {
		System.out.println("main method staeted");

		try {
			System.out.println("10/0");
		} 
		catch (NumberFormatException e) 
		{
			System.out.println("catch block cant handle this exception:"+e);
		}
		System.out.println("Rest of the appliction");
	}
}
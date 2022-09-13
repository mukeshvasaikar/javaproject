package reverse;

import java.util.Scanner;

public class ByusingStringBuilderclass {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		StringBuilder rev = sb.reverse();
		
		System.out.println("Reverse Number is:"+rev);
	}
}

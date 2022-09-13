package reverse;

import java.util.Scanner;

public class ByusingStringBuilder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num = sc.nextInt();
		
	  StringBuilder sb = new	StringBuilder();
	  sb.append(num);
	 StringBuilder rev = sb.reverse();
	 
	 System.out.println("Reverse a Number is:"+rev);
	}
	

}

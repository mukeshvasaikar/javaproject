package frequenty_Asked_java_Program;

import java.util.Scanner;

public class Reverese_Sentences {

	public static void main(String[]args) {
		System.out.println("Enter the string that you wanna reverse");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String s= " ";   // empty string for print out put
		
		String rev[]= str.split(" "); // Tokanized the string (separate by space )
		
		for(int i=rev.length-1;i>=0;i--) {
			s=rev[i]+" ";
		}
		System.out.println("Revers String is"+s);
	}
}

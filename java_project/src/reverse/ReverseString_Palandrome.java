package reverse;

import java.util.Scanner;

import org.apache.http.impl.execchain.MainClientExec;

public class ReverseString_Palandrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you String");
		
		String str = sc.next();
		String org_str= str;   // Storing the string here
		String rev="";
		  
		int len = str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}

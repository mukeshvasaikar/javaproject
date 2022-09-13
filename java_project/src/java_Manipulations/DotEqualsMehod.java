package java_Manipulations;

public class DotEqualsMehod {

	
	public static void main(String[] args) {
		String s1= new String("Mukesh");
		String s2= new String("Mukesh");
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1= new StringBuffer("Mukesh");
		StringBuffer sb2= new StringBuffer("Mukesh");
		
		System.out.println(sb1==sb2);
		
		System.out.println(sb1.equals(sb2));
		
		
		StringBuilder sv1= new StringBuilder("Mukesh");
		StringBuilder sv2= new StringBuilder("Mukesh");
		
		System.out.println(sv1==sv2);
		
		System.out.println(sv1.equals(sv2));
		
		String s5=  ("Mukesh");
		String s6=  ("Mukesh");
		System.out.println(s5==s6);
	}
}

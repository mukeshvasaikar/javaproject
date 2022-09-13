package collection;

import java.util.ArrayList;

public class ArrayDemo {

    public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al.size());
		
		al.add(null);
		al.add("Mukesh");
		al.add(1100);
		al.add(true);
		System.out.println(al.size());
		System.out.println(al);
		
		al.remove("Mukesh");
		System.out.println(al);
		
    	al.set(2,"Rohit");
		System.out.println(al);
		
		al.add(1, "Gauri");
		System.out.println(al);
		
		ArrayList al1 = new ArrayList();
		
		al1.add("Raj");
		al1.add("Vijay");
		al1.add("Babita");
		al.addAll(1, al1);
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add("Mukesh loves Gauri");
		al2.add("Viccky");
		al2.set(0, "Kohinur");
		al.addAll(al2);
		System.out.println(al);
		
		System.out.println(al.lastIndexOf("Gauri"));
	}
	
}

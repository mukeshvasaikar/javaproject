package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListDemo_01 {

	public static void main(String[] args) {
		
		LinkedList<String> l= new LinkedList<String>();
		
		l.add("Mukesh");
		l.add("Kalpesh");
		l.add("Ratna");
		l.add("Java");
		l.add("Selenim");
		
		LinkedList<String> l1= new LinkedList<String>();
		l1.add("Vijay");
		l1.add("Vishal");
		l1.add("Suhas");
		
		l.addAll(1,l1); 
		System.out.println(l);
		 
		ArrayList al = new ArrayList<>(l);
		
		System.out.println(al);
		
		System.out.println(al.get(3));
		
	}
	
	
}

package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		//System.out.println(al.isEmpty());
		
		//System.out.println(al.size());
		
		al.add("Raj");
		al.add("Komal");
		al.add("Vishal");
		al.add("Priya");
		al.add("Vijay");
		al.add("Gauri");
		al.add("Vishal");
		al.add("Rimi");
		
		//al.add(100);  The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
        //System.out.println(al.isEmpty());
		//System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.lastIndexOf("Rimi"));
		System.out.println(al.indexOf("Priya"));
		
		Collections.sort(al);
		
		System.out.println(al);
		
		
		
		
		
	}
	
}

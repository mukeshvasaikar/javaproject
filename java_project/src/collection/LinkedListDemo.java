package collection;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> l= new LinkedList<String>();
		System.out.println(l.size());
	
		l.add("Mukesh");
		l.add("Rani");
		l.add("Kalpesh");
		l.add("Ratna");
		l.add("Aishwarya");
		l.add("swapnil");
		
		l.add("Kalpesh");
		l.add("Ratna");
		
		l.set(3, "Vikas"); 
		l.remove(5);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.removeFirst();
		l.removeLast();
		l.addFirst("Anita");
		l.addLast("Sonal");
		
		
		System.out.println(l.size());
		System.out.println(l);
		
	}

}

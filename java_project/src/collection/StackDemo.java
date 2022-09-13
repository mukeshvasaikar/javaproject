package collection;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack s = new Stack();
	//System.out.println(s.capacity());
	
	//System.out.println(s.empty());
	//System.out.println(s.size());
	
	s.push("Mukesh");
	s.push("Amit");
	s.push("Akoo");
	
	//System.out.println(s.size());
	//System.out.println(s.empty());
	
	
	System.out.println(s.peek());
	System.out.println(s.pop());
	System.out.println(s);
	
	System.out.println(s.search("Amit"));
	System.out.println(s.search("Mukesh"));
}

}

package com.hashmap;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
      
	public static void main(String[] args) {
		
		//Hashtable ht= new Hashtable();  // Capacity is 11, load factore 0.75
		//Hashtable t= new (initial capacity); // create hashtable object with initial capacity
		
		//Hashtable t= new Hashtable(initial capacity, fill ratio/load factore);
		
		Hashtable<Integer,String> t= new Hashtable<Integer, String>();
		t.put(101,"David");
		t.put(102,"Warner");
		t.put(103,"Viru");
		t.put(104,"Sehwag");
		t.put(105,"Sachin");
	//	t.put(null, "d"); //  java.lang.NullPointerException
	//	t.put(104, null);  //java.lang.NullPointerException
		System.out.println(t);
		
		System.out.println(t.get(103));//Viru
		
		t.remove(103);
		System.out.println(t);
		
		
		System.out.println(t.containsKey(102)); // True
		System.out.println(t.containsKey(106));  // false
		
		System.out.println(t.containsValue("David")); // true
		System.out.println(t.containsValue("Mukesh")); // false
		
		System.out.println(t.isEmpty());// false
		
		System.out.println(t.keySet()); // return total no  keys [105, 104, 102, 101]
		
		System.out.println(t.values()); // all the values [Sachin, Sehwag, Warner, David]
		
		for(Object i:t.keySet()) {
			System.out.println(i+"    "+t.get(i));// indivisal values and keys
			
		}
			//ENtry specific method**************
			for(Map.Entry entry:t.entrySet()) {
				
			System.out.println(entry.getKey()+"    " +entry.getValue());
				
				
		}
		
	}
	
	
}

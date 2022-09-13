package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		
	
	HashMap m= new HashMap();

	//HashMap<Integer,String> hm= new HashMap<Integer, String>();
	
	m.put(101,"Raj");
	m.put(102,"Raman");
	m.put(103,"Siraj");
	m.put(104,"Druv");
	m.put(105,"tey");
	m.put(103,"gt");  // Result {101=Raj, 102=Raman, 103=gt, 104=Druv, 105=tey}
	                  // Old value is replace with new vallue
	
	m.put(106,"Siraj"); //{101=Raj, 102=Raman, 103=gt, 104=Druv, 105=tey, 106=Siraj}
                         // value should be duplicated but not key

	System.out.println(m);
	
	System.out.println(m.get(104)); // Druv
	
	m.remove(106); // remove paire from hashmap
	System.out.println(); 
	
	System.out.println(m.containsKey(102));// Returns true
	System.out.println(m.containsKey(106));// Returns false bcz we alredy deleted
	
	System.out.println(m.containsValue("Raman"));  // Returns true
	System.out.println(m.containsValue("v"));  // Returns false bcz value not present
	
	System.out.println(m.isEmpty()); // False boz data is not empty
	
	System.out.println(m.keySet());// return all the keys in the set formate
	
	for(Object i:m.keySet()) 
	{
		System.out.println(i); // retrive all the keys
	}
	
	//System.out.println(m.values());// retuurns all the values in the collection
	
	for(Object i:m.values()) {
		System.out.println(i);  // retrive all the values 
	}
	
	//System.out.println(m.entrySet());// retutns all the entry as a set object
	
	for(Object i:m.keySet()) {
		System.out.println(i+"  "+m.get(i));  // Retrive all the keys with corresponding values
	}
	
	
	
}
}
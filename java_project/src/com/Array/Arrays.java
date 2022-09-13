package com.Array;

public class Arrays {
	
	// Declaring thr array and initializing in different ways
	/*
	public static void main(String[] args) {
		int[]a = new int[3];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		// Approach 01- Individual Approach to declare the array
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		 
		// Approach 02- by using For loop
		for(int i=0; i<3;i++) {
		System.out.println(a[i]);
		
		
		//Approach 03- By Using For each loop
		
		for(int aa:a) {
			System.out.println(aa);
		}
		}
		
		*/
	// If you create an array but not initialized then you will get default value
	/*
	public static void main(String[] args) {
		int[]a= new int[5];
		a[0]=10;
		a[2]=30;
		a[4]=50;
		
		for(int i=0; i<5;i++) {
			System.out.println(a[i]);
		}
		
		String[]s= new String[4];
		s[1]="Rinku";
		s[3]= "Ajay";
		
		for(int i=0; i<4;i++) {
			System.out.println(s[i]);
		}
		}
*/
	
	/*
	public static void main(String[] args) {
		Arrays t1= new Arrays();
		Arrays t2 = new Arrays();
		Arrays[] t = new Arrays[3];
		
		t[0]= t1;
		t[1] = t2;
		t[2] = new Arrays();
		for(Arrays tt:t) {
			System.out.println(tt);
		}
		
	}
	*/
	
	/*
	public  static void main(String[]args) {
		boolean []b =new boolean[3];
		b[0] = true;
		b[2] = false;
    System.out.println(b[0]);
    System.out.println(b[2]);
    
    for(int i=0;i<3;i++) {
    	System.out.println(b[i]);
    	
    }
    for(boolean bb:b) {
    	System.out.println(bb);
    }
    float[]f= {102.2f,202.3f};
    for(float f1:f) {
    	
    	System.out.println(f1);
    }
    
    String[]s= {"Mukesh","Devansh"};
    for(String ss:s) {
    System.out.println(ss);
    }
	}
	*/
	/*
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	*/
	public static void main(String[] args) {
		String [] a= new String [100];
//		int size= a.length;
//		System.out.println(size);
		
		String s= "Mukesh succesfully cracked infosys interview and got 12LPA Package conratulation of him";
		
		int totalChar = s.length();
		System.out.println(totalChar);
	}
	 
	}
	
	
	

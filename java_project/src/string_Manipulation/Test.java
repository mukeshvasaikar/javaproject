package string_Manipulation;

public class Test {
	
	public static void main(String[] args) {
		String s1="Mukesh"; // here object will be created within  the  string constant pool area
		String s2="Mukesh";
		System.out.println(s1==s2); // by using == operator , if two references pointing same object then it will return either true or false
		
		
		String s3= new String ("Mukesh"); // here object will be created within the Heap area
		
		String s4 = new String ("Mukesh");
		
		
		System.out.println(s3==s4);
		
		StringBuffer sb1 = new StringBuffer("Mukesh");
		StringBuffer sb2 = new StringBuffer("Mukesh");
		
		System.out.println(sb1==sb2);
	}

}

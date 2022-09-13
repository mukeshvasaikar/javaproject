package reverse;

public class Reverse_String_ByUsing_BufferClass {
	
	public static void main(String[] args) {
		
		String str ="NEHA";
		String rev ="";
		
		StringBuffer sb = new  StringBuffer(str);
		System.out.println(sb.reverse());
	}

}

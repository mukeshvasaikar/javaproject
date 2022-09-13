package reverse;

public class ReverseStringBy_Using_Char_Array {
	
	public static void main(String[] args) {
		
		String str="Sonal";
		String rev="";
               char a[] = str.toCharArray();
      int len = str.length();
      
      for(int i=len-1; i>=0; i--)
      {
    	 rev=rev+a[i];
    	 
    	 System.out.println("Reverse of a String is:" +rev);
      }
	}

}

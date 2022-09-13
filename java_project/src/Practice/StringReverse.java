package Practice;

public class StringReverse {
	public static void main(String[] args) {
		/*String str="Rakesh";
		String rev =" null";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			System.out.println("Reverrse string is"+rev);
		}
		*/
		
		String str="Mukesh";
		String rev=" ";
		char[]a= str.toCharArray();
		
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
			System.out.println("Reverse string is:"+rev);
		}
	}
		
	}
  
	  
	  
  
	
	
		
	



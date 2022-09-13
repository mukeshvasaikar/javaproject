package reverse;

public class ReverseStringbyConcantationOperator {
	
	public static void main(String[] args) {
		
		String str= "MUKESH";
		String rev = "";
		 
		int len = str.length();
		
		//System.out.println(str.length());
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
			System.out.println("Reverse of a String is:" +rev);
		}
	}

}

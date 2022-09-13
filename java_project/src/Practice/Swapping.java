package Practice;

public class Swapping {
	
	public static void main(String[]args) {
		int a=10, b=20;
		    System.out.println("Before swapping the no is:"+a+" "+b);
		    //1] Using third variable
		   /* int t= a;
		     a=b;
		     b=t;
		     */
		 //   2]  Without using third variable
		    
		/*    a= a+b;
		    b= a-b;
		    a= a-b;
		    */
		    //3] By using single line statement
		    b =(a+b)-(a=b);
		     System.out.println("After swapping the no is :"+a+" " +b);
		
		
	}
	
}
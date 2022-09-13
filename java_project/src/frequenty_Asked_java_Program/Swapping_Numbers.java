package frequenty_Asked_java_Program;

public class Swapping_Numbers {
	
	public static void main(String[] args) {
		  int a=10, b=20;
		  System.out.println("Before swapping of the numbers.."+a+"  "+b);
		
		//Logic1= By using third variable
		 /* int s =a;
		  a=b;
		  b=s;*/
		  
		  //Logic2 - By using Addition and substraction without using third variable
		  
		 /* a=a+b;   // a= 10+20=30
		  b=a-b;   // b =30-20 =10
		  a=a-b;  // a= 30-10 =20 */
		  
		//  Logic3 - By using single statement
		  
		  b= a+b-(a=b); //10+20-(20) =10 and  10+20-(10)=20
		  
		  System.out.println("After swapping the number...."+a+"   "+b);
	}

}

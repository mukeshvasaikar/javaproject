package frequenty_Asked_java_Program;

public class IMP_Program {
   
	
	public static void main(String[]args) {
		/*  REVERSE String
		String str="MUKESH";
		String rev =" ";
		 int len = str.length();
		 for(int i=len-1;i>=0;i--) {
			 
			 rev= rev+str.charAt(i);
		 }
		System.out.println("reverese string is"+rev);
		*/
		
		/* Reverse number
		int num=3698, rev=0;
		int org_num=num;
		while(num!=0) {
			
			rev= rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is"+rev);
		*/
		
		/* Palindrom String
		String str="Radar", reverseStr=" ";
		int len = str.length();
		for(int i=len-1;i>=0;--i) {
			reverseStr=reverseStr+str.charAt(i);
		}
		if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println("is a Palindrom String"+str);
		}
		else {
			System.out.println("is not Palindrom Strig"+str);
		}
		*/
		
		/* Palindrom number
		int num =123, rev=0;
		int org_num= num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(org_num==rev) {
			System.out.println("Palindrom no");
		}
		else {
			System.out.println("not Palindrom no");
		}
		*/
		/* FAbonacy Series
		int a=0,b=2,c;
		System.out.println(a+" "+b);
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
		*/        
	}

}

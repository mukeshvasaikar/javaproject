package java_Manipulations;

public class Double_EqualsOperatore {
	public static void main(String[] args) {
		String s1= new String("Mukesh");
		String s2 = new String("Mukesh");
		System.out.println(s1==s2);
		
		String s3=("Mukesh");
		String s4 = ("Mukesh");
		System.out.println(s3==s4);
		
		
		
		StringBuffer sb1=new StringBuffer("Mukesh");
		StringBuffer sb2=new StringBuffer("Mukesh");
		
		System.out.println(sb1==sb2);
		
		StringBuilder sv1=new StringBuilder("Mukesh");
		StringBuilder sv2=new StringBuilder("Mukesh");
		
		System.out.println(sv1==sv2);
	}

}

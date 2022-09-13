package string_Manipulation;

public class Test1 {

	public static void main(String[] args) {
		String s = new String ("Mukesh");
		s.concat("vasaikar");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Mukesh");
		sb.append("vasaikar");
		System.out.println(sb);
	}
	
	
}

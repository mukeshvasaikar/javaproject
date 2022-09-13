package Practice;

public class DuplicateEle {
	/*
	public static void main(String[]args) {
		String [] s= {"mukesh","raj","dipak","raj","bhau","dipak","kalya","bhurya"};
		for(int i=0; i<s.length;i++) {
			for(int j=i;j<s.length;j++) {
				if(s[i].equals(s[j])&& i!=j) {
					System.out.println("Duplication of an ele is:"+s[i]);
				}
			}
			}
	}
	*/
	
	public static void main(String[]args) {
		String []a= {"Mukesh","Rah", "Mukesh","Jas", "Kas", "Jas"};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i].equals(a[j])&& i!=j) {
					System.out.println("Duplicate string is:" +a[j]);
					
				}
			}
		}
		
	}
}

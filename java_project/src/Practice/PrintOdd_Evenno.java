package Practice;

public class PrintOdd_Evenno {
	public static void main(String[] args) {
		int num = 123654789;
		int even_count=0;
		int odd_count=0;
		while(num>0) {
			int rem =num%10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
		}
		
		System.out.println("number of even no:"+even_count);
		System.out.println("number of even no:"+odd_count);
	}
}

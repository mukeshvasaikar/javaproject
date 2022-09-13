package file_IO_Package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMergerDemo {
	
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("./Data/xyz.txt");
		
		BufferedReader br1 = new BufferedReader(new FileReader("./Data/mkl.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("./Data/lku.txt"));
		
		 String line1 = br1.readLine();
		 String line2 = br2.readLine();
		 
		 while((line1!=null)||(line2!=null)) {
			 
			 if(line1!=null) {
				 pw.println(line1);
				 line1=br1.readLine();
			 }
			 if(line2!=null) {
				 pw.println(line2);
				 line2=br2.readLine();
		 }
	  }
		 pw.flush();
		 br1.close();
		 br2.close();
		 pw.close();
		 
	}

}

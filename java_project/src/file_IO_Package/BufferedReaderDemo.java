package file_IO_Package;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("./Data/abc.txt"));
		
		String line = br.readLine();
		
		while(line!=null) {
			
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}

}

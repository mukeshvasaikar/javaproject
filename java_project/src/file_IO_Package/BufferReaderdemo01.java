package file_IO_Package;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderdemo01 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (new FileReader("./Data/alt.txt"));
		
//		String line = br.readLine();
//		
//		while(line!=null) {
//			System.out.println(line);
//			line= br.readLine();
//			
//			
//		}
//		br.close();
		
		int i = br.read();
		while(i!=-1) {
			System.out.println((char)i);
			i= br.read();
		}
	}

}

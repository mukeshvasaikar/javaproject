package file_IO_Package;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws Exception {

		BufferedWriter bw = new BufferedWriter(new FileWriter("./Data/tetsting.txt"));
		bw.write(65);
		bw.newLine();

		char[] ch = {'k'};
		bw.newLine();

		String str = "Hello infosys members i am your new team member";
		bw.write(str);

		bw.flush();
		
		bw.close();
	}
}

package file_IO_Package;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintwriterDemo {
	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("./Data/Text.txt");

		pw.write(65);
		pw.print(false);
		pw.println("Mukesh");

		pw.print(131);

		pw.flush();
	}

}

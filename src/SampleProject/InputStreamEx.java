package SampleProject;

import java.io.FileReader;
import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\workspace2\\SampleProjects\\PhoneDB.txt");
			int cur = 0;
			while((cur = fr.read()) != -1) {
				System.out.print((char)cur);
			}
			fr.close();
		} catch(IOException e) {
			e.getStackTrace();
		}
	}

}

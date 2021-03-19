package practice.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("PhoneDB.txt")) {
			int i;
			while((i = fr.read()) != -1) {
				System.out.println();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
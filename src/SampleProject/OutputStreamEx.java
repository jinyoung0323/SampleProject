package SampleProject;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		try {
			OutputStream output = new FileOutputStream("D:\\workspace2\\SampleProjects\\output.txt");
			String str = "������ 2021�� 2�� 25�� �Դϴ�.";
			byte[] by = str.getBytes();
			output.write(by);
		} catch(Exception e) {
			e.getStackTrace();
		}
	}

}

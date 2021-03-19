package SampleProject;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		try {
			OutputStream output = new FileOutputStream("D:\\workspace2\\SampleProjects\\output.txt");
			String str = "오늘은 2021년 2월 25일 입니다.";
			byte[] by = str.getBytes();
			output.write(by);
		} catch(Exception e) {
			e.getStackTrace();
		}
	}

}

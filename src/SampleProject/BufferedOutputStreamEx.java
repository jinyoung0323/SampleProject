package SampleProject;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("D:\\workspace2\\SampleProjects\\output.txt"));
			
			String str = "���� ������ ���� �����ϴ�.";
			bs.write(str.getBytes());
		} catch(Exception e) {
			e.getStackTrace();
		} finally {
			bs.close();
		}
	}

}

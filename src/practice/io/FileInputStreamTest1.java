package practice.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			// input.txt ���� �Է� ��Ʈ�� ����.
			fis = new FileInputStream("input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				// ���� ��Ʈ���� finally ��Ͽ��� ����.
				fis.close();
			} catch(IOException e) {
				System.out.println(e);
			} catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}

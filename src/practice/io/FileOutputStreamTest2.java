package practice.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			byte[] bs = new byte[26];
			byte data = 90;
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data--;
			}
			fos.write(bs);	// �迭�� �Ѳ����� ���.
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");

	}
}
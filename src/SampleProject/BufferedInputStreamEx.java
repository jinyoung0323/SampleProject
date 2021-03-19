package SampleProject;

import java.io.FileInputStream;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		try {
			String filePath = "D:\\workspace2\\SampleProjects\\PhoneDB.txt";
			FileInputStream fs = new FileInputStream(filePath);
			
			// 버퍼 선언
			byte[] readBuffer = new byte[fs.available()];
			while(fs.read(readBuffer) != -1) {
				
			}
			
			String str = new String(readBuffer);
			System.out.println(str);
//			System.out.println(readBuffer.length);
			fs.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
	}

}
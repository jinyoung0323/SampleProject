package practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputFileName = sc.nextLine();
		File file = new File("D:\\workspace2\\SampleProjects\\" + inputFileName + ".txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("파일이 존재하지 않습니다.");
				System.out.println("새 파일을 만듧니다.");
			} else {
				System.out.println("파일이 이미 존재합니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}

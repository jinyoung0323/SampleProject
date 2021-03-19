package SampleProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneDB2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>파일 이름을 입력하세요: ");
		String inputFileName = sc.nextLine();
		File file = new File("D:\\workspace2\\SampleProjects\\" + inputFileName + ".txt");
		FileWriter fout = null;
		String fileLine = "";
		try {
			if (!file.exists()) {
				// 입력 스트림 생성
				System.out.println("파일이 존재하지 않습니다.");
				FileReader filereader = new FileReader(file);

				// 입력 버퍼 생성
				BufferedReader bufReader = new BufferedReader(filereader);
//				String contents = "";
//				while ((contents = bufReader.readLine()) != null) {
//					String[] s = contents.split(",");
//				}
//				System.out.println(fileLine);
				// 출력 파일 오픈
				fout = new FileWriter(file, true);
				fout.append("\n김진영,010-9757-3523,031-917-3523\n");
			} else {
				System.out.println("파일이 존재합니다.");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

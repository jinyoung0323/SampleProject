package SampleProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PhoneDB1 {

  public static void main(String[] args) {
    File file = new File("D:\\workspace2\\SampleProjects\\PhoneDB.txt");
    
    try {
      if (file.exists()) {
        // 입력 스트림 생성
        FileReader filereader;
        filereader = new FileReader(file);
        
        // 입력 버퍼 생성
        BufferedReader bufReader = new BufferedReader(filereader);
        String contents = "";
        while ((contents = bufReader.readLine()) != null) {
        	String[] s = contents.split(",");
        	String name = s[0];
        	String hp = s[1];
        	String company = s[2];
        	System.out.println("이름 : " + name);
        	System.out.println("핸드폰 : " + hp);
        	System.out.println("회사 : " + company);
        	System.out.println();
        }
      } else {
        System.out.println("파일이 존재하지 않습니다." );
      }
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
}

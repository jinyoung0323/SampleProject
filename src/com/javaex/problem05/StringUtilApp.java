package com.javaex.problem05;
//import java.util.Scanner;
public class StringUtilApp {

	public static void main(String[] args) {
		/*	
		Scanner scanner = new Scanner(System.in);    
   
		String[] strArray = new String[3];
		System.out.println("�����Է� : ");
		for(int i = 0; i < strArray.length; i++) {
			strArray[i] = scanner.nextLine();
		}
		scanner.close();
		*/
		
		String[] strArray = {"SuperMan", "BatMan", "SpiderMan"};
        String resultStr = StringUtil.concatString(strArray);
        
        
        System.out.println("��� ���ڿ�:" + resultStr);
        
	}

}

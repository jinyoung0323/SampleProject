package com.javaex.problem06;
import java.util.Scanner;
public class FriendApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Friend[] friends = new Friend[3];
		System.out.println("친구를 3명 등록해주세요.");
		
		
		
		
		
//		String name;
//		String phoneNumber;
//		String school;
		for(int i = 0; i < friends.length; i++) {
//			name = scanner.next();
//			phoneNumber = scanner.next();
//			school = scanner.next();
//			friends[i] = new Friend(name, phoneNumber, school);
			String temp = sc.nextLine();
			String[] tempArr = temp.split(" ");
			friends[i] = new Friend(tempArr[0], tempArr[1], tempArr[2]);
		}
		for(int i = 0; i < friends.length; i++) {
			friends[i].show();
		}
		sc.close();
	}

}

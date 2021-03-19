package com.javaex.problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendArrayList {

	public static void main(String[] args) {
		ArrayList<Friend> arrayList = new ArrayList<Friend>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해주세요.");		
		for(int i = 0; i < 3; i++) {
			String sTemp = sc.nextLine();		
			String[] sArr = sTemp.split(" ");
			arrayList.add(new Friend(sArr[0], sArr[1], sArr[2]));
		}
		
		for(Friend friend : arrayList) {
			friend.showAllFriend();
		}
		
		
		sc.close();
	}

}
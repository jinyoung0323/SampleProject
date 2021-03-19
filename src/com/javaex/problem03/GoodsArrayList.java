package com.javaex.problem03;

import java.util.ArrayList;
import java.util.Scanner;

import practice.arraylist.Book;

public class GoodsArrayList {

	public static void main(String[] args) {
		ArrayList<Goods> arrayList = new ArrayList<Goods>();
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("상품 3개를 입력해주세요.");
		for(int i = 0; i < 3; i++) {
			String menu = sc.nextLine();
			String[] sArr = menu.split(" ");
			
			arrayList.add(new Goods(sArr[0], Integer.parseInt(sArr[1]), Integer.parseInt(sArr[2])));
		}
//		for(Goods goods : arrayList) {
//			goods.showInfo();
//			sum += goods.getQuantity();	
//		}
		
		for(int i = 0; i < arrayList.size(); i++) {
			Goods goods = arrayList.get(i);
			goods.showInfo();
			sum += goods.getQuantity();
		}
		System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
		
		sc.close();
	}

}
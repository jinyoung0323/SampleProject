package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String sTemp = sc.nextLine();
			String[] sArr = sTemp.split(" ");
			if(sArr.length == 3) {
				if("+".equals(sArr[1])) {
					Add add = new Add();
					add.setValue(Integer.parseInt(sArr[0]), Integer.parseInt(sArr[2]));
					System.out.println(">> " + add.calculate());

				} else if("-".equals(sArr[1])) {
					Sub sub = new Sub();
					sub.setValue(Integer.parseInt(sArr[0]), Integer.parseInt(sArr[2]));
					System.out.println(">> " + sub.calculate());

				} else if("*".equals(sArr[1])) {
					Mul mul = new Mul();
					mul.setValue(Integer.parseInt(sArr[0]), Integer.parseInt(sArr[2]));
					System.out.println(">> " + mul.calculate());

				} else if("/".equals(sArr[1])) {
					Div div = new Div();
					div.setValue(Integer.parseInt(sArr[0]), Integer.parseInt(sArr[2]));
					System.out.println(">> " + div.calculate());

				} else {
					System.out.println("알 수 없는 연산입니다.");

				}
			} else {
				System.out.println("종료합니다.");
				break;
			}
			
			

		}
		
		sc.close();
	}

}

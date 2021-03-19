package com.javaex.problem01;
import java.util.Scanner;
public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		String operand1, operand2;
		String operator;
		boolean b = true;
		while(b) {
			System.out.print(">> ");
			operand1 = sc.next();
			if("/q".equals(operand1)) {
				System.out.println("�����մϴ�.");
				break;
			}
			operator = sc.next();
			operand2 = sc.next();
			
			
			int num1 = Integer.parseInt(operand1);
			int num2 = Integer.parseInt(operand2);
			
			switch(operator) {
			case "+":
				System.out.print(">> ");
				add.setValue(num1, num2);
				System.out.println(add.calculate());
				break;
			case "-":
				System.out.print(">> ");
				sub.setValue(num1, num2);
				System.out.println(sub.calculate());
				break;
			case "*":
				System.out.print(">> ");
				mul.setValue(num1, num2);
				System.out.println(mul.calculate());
				break;
			case "/":
				System.out.print(">> ");
				div.setValue(num1, num2);
				System.out.println(div.calculate());
				break;
			default:
				System.out.println("�� �� ���� �����Դϴ�.");
				break;
			}
		}
		
		sc.close();
	}

}

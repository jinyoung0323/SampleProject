package com.javaex.problem04;

public class Duck extends Bird {
	
	public void sing() {
		System.out.println("����(" + super.getName() + ")�� �Ҹ����� ��ϴ�.");
	}
	public void fly() {
		System.out.println("����(" + super.getName() + ")�� ���� �ʽ��ϴ�.");
	}
	public void showName() {
		System.out.println("������ �̸��� " + super.getName() + " �Դϴ�.");
	}
}

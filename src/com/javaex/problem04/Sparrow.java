package com.javaex.problem04;

public class Sparrow extends Bird {
	
	public void sing() {
		System.out.println("����(" + super.getName() + ")�� �Ҹ����� ��ϴ�.");
	}
	public void fly() {
		System.out.println("����(" + super.getName() + ")�� ���� �ٴմϴ�.");
	}
	public void showName() {
		System.out.println("������ �̸��� " + super.getName() + " �Դϴ�.");
	}
}

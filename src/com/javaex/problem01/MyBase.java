package com.javaex.problem01;

public class MyBase extends Base {
	public void service(String state) {
		if("��".equals(state)) {
			day();
		} else if("����".equals(state)){
			afternoon();
		} else {
			night();
		}
	}
	public void day() {
		System.out.println("������ ������ ������");
	}
	public void afternoon() {
		System.out.println("���ĵ� ���� ���������� ���ؾ� �մϴ�.");
	}
}

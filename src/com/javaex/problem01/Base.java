package com.javaex.problem01;

public class Base {
	public void service(String state) {
		if("��".equals(state)) {
			day();
		} else {
			night();
		}
	}
	public void day() {
		System.out.println("��");
	}
	public void night() {
		System.out.println("night");
	}
}

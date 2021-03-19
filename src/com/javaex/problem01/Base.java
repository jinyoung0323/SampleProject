package com.javaex.problem01;

public class Base {
	public void service(String state) {
		if("³·".equals(state)) {
			day();
		} else {
			night();
		}
	}
	public void day() {
		System.out.println("³·");
	}
	public void night() {
		System.out.println("night");
	}
}

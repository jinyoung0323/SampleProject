package com.javaex.problem01;

public class Base {
	public void service(String state) {
		if("낮".equals(state)) {
			day();
		} else {
			night();
		}
	}
	public void day() {
		System.out.println("낮");
	}
	public void night() {
		System.out.println("night");
	}
}
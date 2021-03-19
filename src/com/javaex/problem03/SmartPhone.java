package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
	public void execute(String str) {
		if("À½¾Ç".equals(str)) {
			playMusic();
		} else if("¾Û".equals(str)) {
			playApp();
		} else {
			super.execute(str);
		}
	}
	protected void playMusic() {
		System.out.println("´Ù¿î·ÎµåÇØ¼­ À½¾ÇÀç»ý");
	}
	protected void playApp() {
		System.out.println("¾Û½ÇÇà");
	}
}

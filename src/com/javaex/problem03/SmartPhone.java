package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
	public void execute(String str) {
		if("����".equals(str)) {
			playMusic();
		} else if("��".equals(str)) {
			playApp();
		} else {
			super.execute(str);
		}
	}
	protected void playMusic() {
		System.out.println("�ٿ�ε��ؼ� �������");
	}
	protected void playApp() {
		System.out.println("�۽���");
	}
}

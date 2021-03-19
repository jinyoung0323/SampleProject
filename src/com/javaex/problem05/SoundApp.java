package com.javaex.problem05;

public class SoundApp {

	public static void main(String[] args) {
		printSound(new Cat());		// Cat클래스 객체를 생성
		printSound(new Dog());		// Dog클래스 객체를 생성
		printSound(new Sparrow());	// Sparrow클래스 객체를 생성
		printSound(new Duck());		// Duck클래스 객체를 생성
	}
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}

package com.javaex.problem05;

public class SoundApp {

	public static void main(String[] args) {
		printSound(new Cat());		// CatŬ���� ��ü�� ����
		printSound(new Dog());		// DogŬ���� ��ü�� ����
		printSound(new Sparrow());	// SparrowŬ���� ��ü�� ����
		printSound(new Duck());		// DuckŬ���� ��ü�� ����
	}
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}

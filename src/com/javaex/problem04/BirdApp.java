package com.javaex.problem04;

public class BirdApp {

	public static void main(String[] args) {
		Bird bird01 = new Duck();
        bird01.setName("²Ð²ÐÀÌ");
        bird01.fly();
        bird01.sing();
        bird01.showName();

        Bird bird02 = new Sparrow();
        bird02.setName("Â±Â±ÀÌ");
        bird02.fly();
        bird02.sing();
        bird02.showName();
	}

}

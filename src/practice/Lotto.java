package practice;

import java.util.HashSet;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		Random rnd = new Random();
		int number;
		while(set.size() < 6) {
			number = 1 + rnd.nextInt(45);
			set.add(number);
		}
		System.out.println(set);
	}

}

package SampleProject;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(11, 22, 33));
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " => " + list.get(i));
		}
		System.out.println("======================");
		list.add(3);
		list.add(null);
		list.add(1, 10);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " => " + list.get(i));
		}
		
		
		list.remove(1);
		System.out.println("======================");
		System.out.println("list.size() => " + list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " => " + list.get(i));
		}
		System.out.println("======================");
		System.out.println(list.contains(33));
		System.out.println(list.indexOf(33));
	}

}

package SampleProject;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		// ArrayList 이용
		// 1 ~ 20 수를 arrayList에 넣고,
		// 짝수만 제거하고, 나머지 출력
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 20; i++) {
			list.add(i);
		}
		
		for(int i = 1; i <= list.size(); i++) {
			if(list.get(i) % 2 == 0) {				
				list.remove(list.indexOf(list.get(i)));
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " => " + list.get(i));
		}
		
		
	}
}

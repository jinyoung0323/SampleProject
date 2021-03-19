package SampleProject;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
//		HashSet<Integer> set = new HashSet<Integer>(3);
//		
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		System.out.println(set);
//		
//		Iterator iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		System.out.println(set.contains(3));
		
		HashSet<String> setTemp = new HashSet<String>();
		
		setTemp.add("apple");
		setTemp.add("banana");
		setTemp.add("mango");
		setTemp.add("멜론");
		setTemp.add("수박");
		setTemp.add("Water Melon");
		
		if(setTemp.add("banana")) {
			System.out.println("데이터 입력 성공");
		} else {
			System.out.println("같은 객체가 이미 있습니다.");
		}
		
		if(setTemp.remove("mango")) {
			System.out.println("데이터 삭제 성공");
		} else {
			System.out.println("데이터가 없습니다.");
		}
		
		Iterator iter1 = setTemp.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		System.out.println(setTemp);
	}

}

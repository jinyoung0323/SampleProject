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
		setTemp.add("���");
		setTemp.add("����");
		setTemp.add("Water Melon");
		
		if(setTemp.add("banana")) {
			System.out.println("������ �Է� ����");
		} else {
			System.out.println("���� ��ü�� �̹� �ֽ��ϴ�.");
		}
		
		if(setTemp.remove("mango")) {
			System.out.println("������ ���� ����");
		} else {
			System.out.println("�����Ͱ� �����ϴ�.");
		}
		
		Iterator iter1 = setTemp.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		System.out.println(setTemp);
	}

}

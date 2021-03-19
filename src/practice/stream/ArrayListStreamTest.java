package practice.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		ArrayList<String> slist = new ArrayList<String>();
	
		slist.add("Tomas");
		slist.add("Edward");
		slist.add("Jack");
		
		Stream<String> stream = slist.stream();	// ��Ʈ�� ����
		// �迭 ��� �ϳ��� ���.
		stream.forEach(s -> System.out.println(s + " "));
		System.out.println();
		
		slist.stream().sorted().forEach(s -> System.out.println(s));
		
	
	}

}

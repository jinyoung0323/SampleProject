package practice.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		ArrayList<String> slist = new ArrayList<String>();
	
		slist.add("Tomas");
		slist.add("Edward");
		slist.add("Jack");
		
		Stream<String> stream = slist.stream();	// 스트림 생성
		// 배열 요소 하나씩 출력.
		stream.forEach(s -> System.out.println(s + " "));
		System.out.println();
		
		slist.stream().sorted().forEach(s -> System.out.println(s));
		
	
	}

}

package practice.linkedlist;
import java.util.LinkedList;
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addFirst(1);
		list.addLast(2);
		list.add(3);
		list.add(1, 10);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}

package SampleProject;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Point2> plist = new LinkedList<Point2>();
		
		plist.add(new Point2(1, 1));
		plist.add(new Point2(3, 5));
		plist.add(new Point2(4, 7));
		
		for(int i = 0; i < plist.size(); i++) {
			System.out.println(plist.get(i));
		}
	}

}

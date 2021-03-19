package SampleProject;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLotto {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>(6);
		
		while(set.size() < 6) {
			set.add((int)(Math.random() * 45 + 1));
		}
		System.out.println("set.size() : " + set.size());

//		Iterator<Integer> iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		System.out.println(set);
	}

}
package SampleProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
	
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("grape", "포도");
		map.put("mango", "망고");
		System.out.println(map);
		
		
		map.remove("mango");
		System.out.println(map);
		System.out.println(map.size());
		// entrySet() 활용
//		for(Entry<Integer, String> entry : map.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
//		}
		// KeySet() 활용
//		for(Integer i : map.keySet()) {
//			System.out.println("Key : " + i + ", Value : " + map.get(i));
//		}
		
		// entrySet().iterator() 활용
		Iterator<Entry<String, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<String, String> entry = entries.next();
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}
		
		// KeySet().iterator() 활용
//		Iterator<Integer> keys = map.keySet().iterator();
//		while(keys.hasNext()) {
//			int key = keys.next();
//			System.out.println("Key : " + key + ", Value : " + map.get(key));
//		}
		
	}

}
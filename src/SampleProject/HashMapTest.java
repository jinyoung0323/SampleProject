package SampleProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
	
		map.put("apple", "���");
		map.put("banana", "�ٳ���");
		map.put("grape", "����");
		map.put("mango", "����");
		System.out.println(map);
		
		
		map.remove("mango");
		System.out.println(map);
		System.out.println(map.size());
		// entrySet() Ȱ��
//		for(Entry<Integer, String> entry : map.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
//		}
		// KeySet() Ȱ��
//		for(Integer i : map.keySet()) {
//			System.out.println("Key : " + i + ", Value : " + map.get(i));
//		}
		
		// entrySet().iterator() Ȱ��
		Iterator<Entry<String, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<String, String> entry = entries.next();
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}
		
		// KeySet().iterator() Ȱ��
//		Iterator<Integer> keys = map.keySet().iterator();
//		while(keys.hasNext()) {
//			int key = keys.next();
//			System.out.println("Key : " + key + ", Value : " + map.get(key));
//		}
		
	}

}

package SampleProject;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// ArrayList�� �̿�
		// a~z ���ĺ� ���ڿ��� ArrayList�� �ְ�,
		// ArrayList ��ü ��Ҹ� ���
		ArrayList<String> slist = new ArrayList<String>();
		
//		for(char c = 'a'; c <= 'z'; c++) {
//			String str = Character.toString(c);
//			slist.add(str);
//		}
		for(int i = 97; i <= 122; i++) {
			String str = Character.toString(i);
			slist.add(str);
		}
		for(int i = 0; i < slist.size(); i++) {
			System.out.println(slist.get(i));
		}
	}

}

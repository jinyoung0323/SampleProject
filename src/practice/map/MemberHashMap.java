package practice.map;

import java.util.HashMap;
import java.util.Iterator;

import practice.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> it = hashMap.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		
	}
}

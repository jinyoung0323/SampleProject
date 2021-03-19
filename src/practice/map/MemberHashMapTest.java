package practice.map;

import practice.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member m1 = new Member(1001, "이지원");
		Member m2 = new Member(1002, "손민국");
		Member m3 = new Member(1003, "박서훤");
		Member m4 = new Member(1004, "홍길동");
		
		memberHashMap.addMember(m1);
		memberHashMap.addMember(m2);
		memberHashMap.addMember(m3);
		memberHashMap.addMember(m4);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		
		memberHashMap.showAllMember();
	}

}
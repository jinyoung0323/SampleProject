package practice.map;

import practice.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member m1 = new Member(1001, "ÀÌÁö¿ø");
		Member m2 = new Member(1002, "¼Õ¹Î±¹");
		Member m3 = new Member(1003, "¹Ú¼­ÈÍ");
		Member m4 = new Member(1004, "È«±æµ¿");
		
		memberHashMap.addMember(m1);
		memberHashMap.addMember(m2);
		memberHashMap.addMember(m3);
		memberHashMap.addMember(m4);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		
		memberHashMap.showAllMember();
	}

}

package practice.map;

import practice.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member m1 = new Member(1001, "ÀÌÁö¿ø");
		Member m2 = new Member(1002, "¼Õ¹Î±¹");
		Member m3 = new Member(1003, "¹Ú¼­ÈÍ");
		Member m4 = new Member(1004, "È«±æµ¿");
		
		memberTreeMap.addMember(m1);
		memberTreeMap.addMember(m2);
		memberTreeMap.addMember(m3);
		memberTreeMap.addMember(m4);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		
		memberTreeMap.showAllMember();
	}

}

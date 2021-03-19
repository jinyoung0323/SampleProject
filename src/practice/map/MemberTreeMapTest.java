package practice.map;

import practice.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member m1 = new Member(1001, "������");
		Member m2 = new Member(1002, "�չα�");
		Member m3 = new Member(1003, "�ڼ���");
		Member m4 = new Member(1004, "ȫ�浿");
		
		memberTreeMap.addMember(m1);
		memberTreeMap.addMember(m2);
		memberTreeMap.addMember(m3);
		memberTreeMap.addMember(m4);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		
		memberTreeMap.showAllMember();
	}

}

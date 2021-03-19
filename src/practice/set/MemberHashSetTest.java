package practice.set;

import practice.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member member1 = new Member(1001, "������");
		Member member2 = new Member(1002, "�չα�");
		Member member3 = new Member(1003, "�ڼ���");
		
		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		
		Member member4 = new Member(1002, "�չα�");
		memberHashSet.addMember(member4);
		memberHashSet.showAllMember();
	}

}

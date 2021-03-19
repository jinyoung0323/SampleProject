package practice.set;

import practice.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member member3 = new Member(1003, "박서훤");
		Member member1 = new Member(1001, "이지원");
		Member member2 = new Member(1002, "손민국");
		
		memberTreeSet.addMember(member3);
		memberTreeSet.addMember(member2);
		memberTreeSet.addMember(member1);
		
		Member member4 = new Member(1002, "홍길동");
		memberTreeSet.addMember(member4);
		memberTreeSet.showAllMember();
	}

}
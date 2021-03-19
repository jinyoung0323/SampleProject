package practice.set;

import practice.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member member3 = new Member(1003, "¹Ú¼­ÈÍ");
		Member member1 = new Member(1001, "ÀÌÁö¿ø");
		Member member2 = new Member(1002, "¼Õ¹Î±¹");
		
		memberTreeSet.addMember(member3);
		memberTreeSet.addMember(member2);
		memberTreeSet.addMember(member1);
		
		Member member4 = new Member(1002, "È«±æµ¿");
		memberTreeSet.addMember(member4);
		memberTreeSet.showAllMember();
	}

}

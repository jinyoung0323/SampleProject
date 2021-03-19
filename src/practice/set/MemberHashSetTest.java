package practice.set;

import practice.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member member1 = new Member(1001, "ÀÌÁö¿ø");
		Member member2 = new Member(1002, "¼Õ¹Î±¹");
		Member member3 = new Member(1003, "¹Ú¼­ÈÍ");
		
		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		
		Member member4 = new Member(1002, "¼Õ¹Î±¹");
		memberHashSet.addMember(member4);
		memberHashSet.showAllMember();
	}

}

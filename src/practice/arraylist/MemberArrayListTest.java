package practice.arraylist;
import practice.Member;
public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// ���ο� ȸ�� �ν��Ͻ� ����
		Member member1 = new Member(1001, "������");
		Member member2 = new Member(1002, "�չα�");
		Member member3 = new Member(1003, "�ڼ���");
		Member member4 = new Member(1004, "ȫ�浿");
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(member4.getMemberId());
		memberArrayList.showAllMember();
		
	}

}

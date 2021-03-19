package practice.set;

import practice.Member;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;	// HashSet����
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean remove(int memberId) {
		Iterator<Member> it = hashSet.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			if(member.getMemberId() == memberId) {
				hashSet.remove(member);	// ȸ������
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}

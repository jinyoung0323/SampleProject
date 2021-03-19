package practice.map;
import java.util.Iterator;
import java.util.TreeMap;
import practice.Member;
public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> it = treeMap.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}

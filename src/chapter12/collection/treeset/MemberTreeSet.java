package chapter12.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import chapter12.collection.Member2;

//TreeSet클래스의 데이터로 Member클래스 사용하기. 
public class MemberTreeSet {

	private TreeSet<Member2> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member2>();
		
	}
	
	//데이터 추가
	//동작하면서 , Member2 클래스의 compareTo() 메서드가 호출됨.
	public void addMember(Member2 member) {
		treeSet.add(member); //객체의 주소값 저장
	}
	
	// 데이터 제거
	// Collection요소를 순회하는 Iterator작업
		public boolean remveMember(int memberId) {
			// arrayList 객체가 가지고 있는 데이터를 순차적으로 접근할 수 있는 객체 ir
			Iterator<Member2> ir = treeSet.iterator();
			//ir 객체는 커서라는 포인터 를 이용하여 데이터를 참저하는데
			//처음 가리키는 위치에 데이터가 존재하면 hasNext()가 true
			//아니면 false를 반환한다.
			while(ir.hasNext()) {
				Member2 member = ir.next(); // 커서가 가리키는 위치에서 데이터를 읽어온다. 커서가 그 다음위치로 이동
				int tempId = member.getMemberId();
				if(tempId == memberId) {
					treeSet.remove(member); // 멤버를 삭제.
					return true;
				}
			}
			
			return false;	
		}
	
	//모든 데이터 보기
	public void showAllMember() {
		//4번 반복
		for(Member2 member: treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}

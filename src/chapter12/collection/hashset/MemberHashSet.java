package chapter12.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter12.collection.Member2;

//HashSet클래스의 데이터로 Member클래스 사용하기. 
public class MemberHashSet {

	private HashSet<Member2> hashSet;
	
	//기억장소를 인덱스로 관리한느 특징(순서가 있다.), 데이터 중복이 허용
	public MemberHashSet() {
		hashSet = new HashSet<Member2>();
		
	}
	
	//데이터 추가
	public void addMember(Member2 member) {
		hashSet.add(member); //객체의 주소값 저장
	}
	
	// 데이터 제거
	// Collection요소를 순회하는 Iterator작업
		public boolean remveMember(int memberId) {
			// arrayList 객체가 가지고 있는 데이터를 순차적으로 접근할 수 있는 객체 ir
			Iterator<Member2> ir = hashSet.iterator();
			//ir 객체는 커서라는 포인터 를 이용하여 데이터를 참저하는데
			//처음 가리키는 위치에 데이터가 존재하면 hasNext()가 true
			//아니면 false를 반환한다.
			while(ir.hasNext()) {
				Member2 member = ir.next(); // 커서가 가리키는 위치에서 데이터를 읽어온다. 커서가 그 다음위치로 이동
				int tempId = member.getMemberId();
				if(tempId == memberId) {
					hashSet.remove(member); // 멤버를 삭제.
					return true;
				}
			}//책의 예제는 Iterator 작업이 여기에 존재한다. 
			 // 복잡해보여 아래 removeMember2()메서드로 분리함.
			
			return false;	
		}
	

	
	//모든 데이터 보기
	public void showAllMember() {
		//4번 반복
		for(Member2 member: hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}

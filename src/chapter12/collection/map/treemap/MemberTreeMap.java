package chapter12.collection.map.treemap;


import java.util.Iterator;
import java.util.TreeMap;
import chapter12.collection.Member2;

//Map 인터페이스를 상속받아 구현한 TreeMap클래스
//자료구조를 이진형태로 분류해서 정렬
//대소비교를 통한 정렬구조로 관리하기 때문에 반드시 데이터 객체가(Member22) comparable or comparator 인터페이스를 구현해야 한다.
public class MemberTreeMap {

	private TreeMap<Integer, Member2> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member2>();
	}
	
	//데이터 추가
	public void addMember(Member2 member) {
		treeMap.put(member.getMemberId(), member); //객체의 주소값 저장
	}
	
	
	// 데이터 제거
		public boolean remveMember(int memberId) {
				if(treeMap.containsKey(memberId)) {
					treeMap.remove(memberId);
					return true;
				}
			return false;	
		}
	
	//모든 데이터 보기
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
		int key = ir.next();
		//key 로 저장된 데이터가 member
		Member2 member = treeMap.get(key);
		System.out.println(member);
		}
		System.out.println();
	}
}
	

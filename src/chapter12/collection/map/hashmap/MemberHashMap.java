package chapter12.collection.map.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import chapter12.collection.Member;
import chapter12.collection.Member2;

//HashSet클래스의 데이터로 Member 클래스 사용하기. 
public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	//기억장소를 인덱스로 관리한느 특징(순서가 있다.), 데이터 중복이 허용
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	//데이터 추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member); //객체의 주소값 저장
	}
	
	
	// 데이터 제거
	// Collection 요소를 순회하는 Iterator 작업
		public boolean remveMember(int memberId) {
				if(hashMap.containsKey(memberId)) {
					hashMap.remove(memberId);
					return true;
				}
			return false;	
		}
	
	//모든 데이터 보기
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
		int key = ir.next();
		//key 로 저장된 데이터가 member
		Member member = hashMap.get(key);
		System.out.println(member);
		}
		System.out.println();
	}
}
	

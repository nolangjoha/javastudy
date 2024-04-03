package chapter12.collection.map.hashmap;

import chapter12.collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberSon = new Member(1001, "손흥민");
		Member memberKim = new Member(1002, "김민재");
		Member memberLee = new Member(1003, "이강인");
		Member memberHwa = new Member(1004, "황희찬");
		
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHwa);
		
		memberHashMap.showAllMember();// 4개 member 객체가 출력
		
		Member memberLee2 = new Member(1003, "이강두");
		//키 값(1003)은 중복이 안된다. 동일한 키로 다시작성할 경우 기존 데이터를 덮어씌운다.
		memberHashMap.addMember(memberLee2);
		
		memberHashMap.showAllMember(); // 5개 member 객체가 출력
		
	}

}

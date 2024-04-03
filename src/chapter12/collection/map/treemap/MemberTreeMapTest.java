package chapter12.collection.map.treemap;

import chapter12.collection.Member2;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member2 memberSon = new Member2(1001, "손흥민");
		Member2 memberKim = new Member2(1002, "김민재");
		Member2 memberLee = new Member2(1003, "이강인");
		Member2 memberHwa = new Member2(1004, "황희찬");
		
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberHwa);
		
		memberTreeMap.showAllMember();// 4개 member 객체가 출력
		
		Member2 memberLee2 = new Member2(1003, "이강두");
		//키 값(1003)은 중복이 안된다. 동일한 키로 다시작성할 경우 기존 데이터를 덮어씌운다.
		memberTreeMap.addMember(memberLee2);
		
		memberTreeMap.showAllMember(); // 5개 member 객체가 출력
		
	}

}

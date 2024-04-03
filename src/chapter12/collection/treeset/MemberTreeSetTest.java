package chapter12.collection.treeset;

import chapter12.collection.Member2;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		//객체생성(데이터)
		//아래 객체가 TreeSet클래스 메모리에 저장될 때, 대소비교가 가능하게 하려면
		// Member2 클래스가 반드시 1) Comparable 인터페이스 또는 2) Comparator 인터페이스를 구현해야 한다. 
		Member2 memberSon = new Member2(1001, "손흥민");
		Member2 memberKim = new Member2(1002, "김민재");
		Member2 memberLee = new Member2(1003, "이강인");
		Member2 memberHwa = new Member2(1004, "황희찬");
		
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberHwa);
		
		memberTreeSet.showAllMember();// 4개 member 객체가 출력
		
		Member2 memberLee2 = new Member2(1003, "이강인");
		memberTreeSet.addMember(memberLee2);
		
		memberTreeSet.showAllMember(); // 5개 member 객체가 출력
		
	}

}

package chapter12.collection.linkedlist;


import java.util.LinkedList;

import chapter12.collection.Member;

//LinkedList클래스의 데이터로 Member클래스 사용하기. 
public class MemberLinkedList {

	private LinkedList<Member> linkedList;
	
	//기억장소를 인덱스로 관리한느 특징(순서가 있다.), 데이터 중복이 허용
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
		
	}
	
	//데이터 추가
	public void addMember(Member member) {
		linkedList.add(member); //객체의 주소값 저장
	}
	
	//데이터 제거
	public boolean removeMember(int memberId) {
		
		//arrayList.aize() : 컬렉션기억장소의 요소의 개수.
		for(int i = 0; i<linkedList.size(); i++) {
			Member member = linkedList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				linkedList.remove(i);  //멤버를 삭제.
				return true;
			}
		}		
		return false;
	}
	//모든 데이터 보기
	public void showAllMember() {
		//4번 반복
		for(Member member: linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}
}

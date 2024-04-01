package chapter12.collection.arraylist;

import java.util.ArrayList;

import chapter12.collection.Member;

//ArrayList클래스의 데이터로 Member클래스 사용하기. 
public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	//기억장소를 인덱스로 관리한느 특징(순서가 있다.), 데이터 중복이 허용
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
		
	}
	
	//데이터 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//데이터 제거
	public boolean removeMember(int memberId) {
		
		//arrayList.aize() : 컬렉션기억장소의 요소의 개수.
		for(int i = 0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);  //멤버를 삭제.
				return true;
			}
		}		
		return false;
	}
	//모든 데이터 보기
	public void showAllMember() {
		//4번 반복
		for(Member member: arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}

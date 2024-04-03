package chapter12.collection;



// TreeSet클래스에서 이 클래스가 객체생성하여, 데이터로 사용하기 위하여, 
// 아래 인터페이스를 반드시 구현해야 한다.
public class Member2 implements Comparable<Member2> {

	private int memberId;
	private String memberName;
	
	//매개변수가 있는 생성자
	public Member2(int memberId, String memberName) {
		super();  //작성하지 않아도 컴파일 과정에서 자동 생성된다. Object 클래스의 기본생성자 호출
		this.memberId = memberId;
		this.memberName = memberName;
	}

	// getter or setter 메서드 : private 변수에 접근하기 위해 만들었음.
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	// 재정의의 목적 : 클래스의 필드내용 확인
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}	
	
	//객체비교로 사용되는 메서드 재정의
	@Override
	public int hashCode() {
		return memberId;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2) obj;
//			if(this.memberId == member.memberId && this.memberName.equals(member.memberName))
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		} return false;
	}
	
	//객체가 대소비교에 사용되는 추상 메서드 구현용도.
/*	@Override
	public int compare(Member2 o1, Member2 o2) {
		//Member2 클래스 대소비교할 때 기준을 잡아야 한다.
		//MemberID를 대소비교로 대소비교 대상으로 기준을 잡음.
		return memberId - o.getMemberId();
	}
*/

	@Override
	public int compareTo(Member2 o) {
		System.out.println("compareTo 호출");
		System.out.println(memberId - o.getMemberId());
		return memberId - o.getMemberId();	// 오름차순
		
//		return this.memberId - o.memberId) = (-1); //내림차순
				
	}

	
	
}

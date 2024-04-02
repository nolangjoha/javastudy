package chapter12.collection;

public class Member2 {

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
			if(this.memberId == member.memberId && this.memberName.equals(member.memberName))
				return true;
			else
				return false;
		} return false;
	}
	
}

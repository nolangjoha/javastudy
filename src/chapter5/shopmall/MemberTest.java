package chapter5.shopmall;

public class MemberTest {

	public static void main(String[] args) {
		// 클래스 사용법
		// 객체 생성
		// 클래스로 만든 변수를 다른 변수들이랑 구분하기 위하여 객체라고 부른다. 
		// 클래스명 변수 =  new 클래스이름();
		// Member(); : 클래스 이름으로 되어있는 메서드를 생성자 라 부른다.
		// new : Heap 영역에 클래스 기능을 이용하여 메모리를 생성하는 기능
		
		//Member mem =  new Member();  아래 처럼 2줄로도 표현 가능하다. 
		   
		Member mem = null; //클래스로 만든 객체는 stack 영역에
		mem = new Member();
	}

}
//null : 아무것도 참조하고 있지 않다.라는 의미 
//class로 만든 stack영역의 변수의 처음 값은 null을 써야 한다.(규칙) 
// 이곳에는 주소가 들어올 예정이다.
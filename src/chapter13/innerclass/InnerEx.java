package chapter13.innerclass;

//내부 클래스: 클래스 안에 클래스를 정의
//내부클래스는 다른 클래스와 협력할 일이 없는 경우 내부클래스로 선언해 사용한다.
//만든 사유 : 클래스간 쉽게 접근이 가능하며, 메서드 호출이 가능함.
//장점 : B 클래스에서 객체생성을 하지 않고 A의 객체 메서드 등을 사용 할 수 있다. 
// 클래스가 분리된 상태에서 다른 클래스의 요소를 쓰려면 객체를 생성해야 한다.

// 자바기반의 안드로이드 개발, GUI 응용프로그램 개발 시 주로 사용.
class A{
	int a = 100;
	void methodA() {
		System.out.println(a);
	}
	//A클래스 내 B클래스
	class B{ 
		int x = 100;
		void methodB() {
			System.out.println(x);
			
			//A클래스의 멤버 직접 접근 가능
			System.out.println(a);
			methodA();
		}
	}
} 
	

public class InnerEx {

	public static void main(String[] args) {

	}
}

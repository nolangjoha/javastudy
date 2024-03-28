package chapter10.interfaceex;

// 인터페이스를 상속받는 클래스는 extends가 아니라 implements를 사용해야 한다.  
// 구현클래스 : 인터페이스의 내용을 구현한다.
public class Cat implements Animal {

	
	// 부모인터페이스의 추상메서드를 구현한다(구현메서드).
	// 재정의 메서드라고 부를 수도 있다.
	@Override
	public void run() {
		System.out.println("고양이가 달려갑니다.");
	}

	@Override
	public void cry() {
		System.out.println("고양이가 야옹하고 웁니다.ㄴ");
	}

}

package chapter10.interfaceex;

// 구현클래스
public class Dog implements Animal {

	@Override
	public void run() {
		System.out.println("강아지가 달려갑니다.");
	}
	
	@Override
	public void cry() {
		System.out.println("강아지가 멍멍 짖어요.");
	}
	
}

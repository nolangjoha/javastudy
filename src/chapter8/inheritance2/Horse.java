package chapter8.inheritance2;

public class Horse extends Animal {

	/*
	// 메서드
	void wake() {
		System.out.println("호랑이가 달린다.");
	}
	
	void cry() {
		System.out.println("호랑이가 포효하다.");
	}
	*/
	
	@Override
	void run() {
		System.out.println("말 달리자.");
	}

	
	@Override
	void cry() {
		System.out.println("말이 투레질 한다.");
	}
	
	
}

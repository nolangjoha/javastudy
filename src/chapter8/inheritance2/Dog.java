package chapter8.inheritance2;

public class Dog extends Animal {
	
	/*
	//메서드
	void move() {
		System.out.println("강아지가 달린다");
	}
	void cry() {
		System.out.println("강아지가 짖다.");
	}
	*/
	
	
	// run()메서드의 내용을 내 클래스의 용도에 맞게 새롭게 구성하고싶다.
	//상속관계에서 부모클래스의 메서드명 그대로 사용하여, 내용을 재구성하는 작업 - overriding
	
	@Override
	void run() {
	// 새로운 작업 쓰는 곳
		System.out.println("강아지가 달린다.");
	// 내 작업도 하면서 부모 메서드도 가져오고 싶다! 할땐 아래와 같이. : 부모클래스 내용 호출
	// super.run();
	
	}
	

	@Override   //@이름 : Annotation  // 이걸 안적으면 자바가 이 클래스가 부모클래스를 상속한건지 아닌지 검사하는 작업을 거친다.
	void cry() {
	//새로운작업
		System.out.println("강아지가 멍멍 짖는다.");
	
	}
	
}

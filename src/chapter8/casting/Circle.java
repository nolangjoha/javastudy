package chapter8.casting;


// 원형
public class Circle extends Shape {

	//부모클래스의 draw메서드 재정의
	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	
	void circle() {
		System.out.println("원 입니다.");
	}
	
	void method1() {
		super.draw();
	}
	
}

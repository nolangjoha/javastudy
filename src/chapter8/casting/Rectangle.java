package chapter8.casting;

public class Rectangle extends Shape {

	@Override  // 첫자 대문자 주의
	void draw() {
		System.out.println("draw Rectangle");
	}
	
	void Rectangle() {
		System.out.println("네모 입니다.");
	}
	
	
}

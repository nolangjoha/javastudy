package chapter10.interfaceinheritance;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();

		//mClas.x(); 이렇게 단순 호출을 할 수 있겠으나 그렇게 하지 않는 이유는 다형성 때문이다.
		
		//할아버지 인터페이스와 나(손자) 자신의 클래스객체 / 자동으로 형변환
		X xClass = mClass;  //자동차 바퀴 넣는 공간 = 바퀴(다른 애가 올 수도 있다.)
		xClass.x(); //구현된 메서드 호출
		
		//부모인터페이스와 나(아들) 자신의 클래스 객체
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
		
		
	}

}

package chapter8.exam;

public class Child extends Parent {

	private int c;
	private int d;
	
	public Child() {
		//super();가 컴파일 될때 자동생성된다. 생략되어 있었다. 부모생성자를 가리킨다.
		System.out.println("자식생성자 호출: Child()");
	}
	
	//매개변수가 있는 생성자
	public Child(int a, int b) {
		super(a, b); //부모클래서의 생성자 호출
	}
	
	void methodC() {	
	}
	void methodD() {	
	}
	
	
	//컴파일러는 부모클래스의 메서드를 재정의하는 의미로 아래코드를 해석
	@Override  //Annotation. 메서드 재정의 (이거 스프링에 많음)
	void methodA() {
		// TODO Auto-generated method stub
		super.methodA();
	}
	
	
	
}

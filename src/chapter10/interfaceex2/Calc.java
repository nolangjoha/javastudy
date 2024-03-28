package chapter10.interfaceex2;

//최상위 부모 인터페이스 : 상속목적으로 설계. 객체생성 불가능
public interface Calc {

	//구성요소
	//상수, 추상메서드, default메서드, static메서드
	//private 메서드 - jdk 1.9부터
	
	//상수. final. compile 하면 public final static이 자동으로 붙는다.
	double PI = 3.14; // 상수는 어떤 특정값을 부르기 위한 이름.
	int ERROR = -999999999;
	
	// 추상메서드. compile하면 public abstract는 int 앞쪽에 자동으로 붙는다. 
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//일반메서드 : 사용불가
	// public void methodA() {}
	// jdk 1.8 부터 default, static메서드가 지원
	default void description() {  //추상클래스와 구분하기 위해 default
	}  
	
	static void myStaticMethod() { 
	}
	
	//jdk 1.9 private 메서드가 지원, 이건 버전이 1.8일때 쓰면 에러 발생
	//private 접근자는 접근 불가
	private void myMethod() {
		System.out.println("private 메서드 입니다.");
	}
	
	
	
	
}

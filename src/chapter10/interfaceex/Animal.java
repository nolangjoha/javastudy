package chapter10.interfaceex;

//인터페이스
//추상메서드 목적으로 존재하는 것
//객체생성 불가능
//상속을 목적으로 한다.
public interface Animal {

	//필드 사용 불가능
//	String eyeColor;
//	String speed;
	
	//몸체가 있는 메서드 사용 불가
//	void methodA() {}  
	
	void run(); //public abstract void run(); 주석처럼 작성해도 되지만 컴파일 될 때 알아서 만들어진다.
	void cry(); //public abstract void cry(); 
	
}

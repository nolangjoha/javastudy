package chapter9.abstractex;

//추상클래스는 abstract 키워드를 사용해야 한다.
/* [추상클래스 특징]★★★★★★★★★ (암기)
 1) 객체생성 불가능 ( new 생성자() )
 2) 상속을 목적으로 함.
 3) 상속을 받은 자식클래스는 강제 구현해야함.(안하면 에러)
 */
//몸체가 없는 메서드(추상메서드) : 메서드의 기능을 정의할 필요가 없다고 결정되면, 추상클래스로 구상할것.
public abstract class Animal {
	//필드 /만들 수 있음.
	String eyeColor;
	String speed;
	//메서드 / 만들 수 있음.
	void methodA() {}	
	
	//추상메서드 : 몸체(body)없는 메서드
	abstract void run();
	
	abstract void cry();
		
}

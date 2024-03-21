package chapter5.constructor;

//생성자(Constructor) 예제
public class Person {
	
	//필드생성
	String name;
	float height;
	float weight;
	
	//생성자
	// 컴파일 과정에서 Person.class 파일에 기본 생성자가 자동 생성된다.
	
	// 생성자 메서드 이름을 만들때는 class 이름을 사용해야하는 (규칙!!)이 있다.
	// public 생성자이름() { }
	//생성자를 수동으로 정의하면, 컴파일 과정에서 Person.class 파일에 기본 생성자가 자동 생성된다. (원래 이렇게 설계되어 있음.)
	
	/*
	public Person() {
		//코드작성 목적
		System.out.println("생성자 호출");
	}
	*/
	
	//매개변수가 있는 생성잘르 정의하면 , 컴파일 과정에서 class 파일에 기본생성자가 자동으로 생성이 안된다.
	// 힙영역에 생성된 기억장소에 값을 주고자 할 때 사용한다. 
	public Person(String n) {
		name = n;
		
	}
	
	public Person(float h) {
		height = h;
	}
	
	
	
	
}






















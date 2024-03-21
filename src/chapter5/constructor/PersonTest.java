package chapter5.constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		//처음부터 위에 값을 주고 시작하고 싶을 때 class파일에 매개변수가 있는 생성자를 정의해라
		
		/*
		Person p1 = new Person(); // ctrl 누른 상태에서 Person() 을 클릭하면 어디를 가리키는 건지 알려준다.
*/
		
		/* 위의 코드를 작성하면
		 스택영역에 Person p1기억장소가 만들어진다. 기억장소의 이름은 p1. 
		 new 가 person 이란 클래스를 찾아가서 필드의 내용을 보고 힙영역에 String name을 형성한다. 
		 그리고 나머지 float height; float weight; 각각 만들어준다.
		 
 		 원본소스에 생성자가 없어도 컴파일 과정에서 class 파일에 생성자(Person())가 자동 생성된다.
		*/
		
		// 생성자
		// 컴파일 과정에서 person.cㅣass파일에 생성자가 자동 생성된다. 
		
		
		// 힙영역에 생성된 Person 클래스의 필드값을 확인
		// 아래는 자바에서 자동으로 만들어준 값
		System.out.println(p1.name);    //null
		System.out.println(p1.height);  // 0.0
		System.out.println(p1.weight);  // 0.0
		
		Person p2 = new Person(50.0f);  //f 안넣으면 class에 있는 타입이 float이기 때문에 형식이 일치 하지 않아 에러 발생
		System.out.println(p2.height);
		
	}
	

}

// 
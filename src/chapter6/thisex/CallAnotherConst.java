package chapter6.thisex;

//다른 생성자를 호출하는 예제

class Person{
	String name;
	int age;
	
	//생성자
	// 같은 생성자끼리 동일한 생성자를 호출 할 수 있다.
	Person() {
		this("이름없음", 1); // 생성자끼리 호출하는 구문.
	}
		
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		Person noName2 = new Person("이름없음", 1);
		//위에 2개 같은 값
			
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		System.out.println(noName2.name);
		System.out.println(noName2.age);
	
		
		Person ps1 = new Person("홍길동", 100);
		System.out.println(ps1.name);
		System.out.println(ps1.age);
		
		
		
	}

}

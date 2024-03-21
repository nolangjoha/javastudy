package chapter5.classpart;

public class PersonTest {
	
	public static void main(String[] args) {
		//person 클래스  사용 - 기억장소가 생성된 의미. 
		
		//<클래스 사용 문법>
		//데이터 타입 이름 = new 데이터 타입 이름();  // 클래스는 데이터 타입이다. 아래줄과 같다.
		//클래스명 이름 = new 클래스 ();  // 여기서 이름은 내 마음대로 정할 수 있다.
		// 오른쪽에는 메소드를 사용해야 하며 메소드 명은 클래스 명을 사용해야 한다(규칙)
		// new 다음에 ctrl + 스페이스 하면 클래스명 메소드가 나온다.
		
		// Person이라는 붕어빵틀(클래스)로 각기 다른 정보를 가진 붕어빵(객체)을 만들 수 있다.
		Person ps1 = new Person();   //팥붕
		 // ps1객체가 가리키는 기억장소 표현
		ps1.name = "홍길동";
		ps1.height = 180;
		ps1.weight = 75;
		ps1.gender = 'M';
		ps1.married = true;
		
		//효율적. class에 있는 메서드 사용
		ps1.getPersonInfo();
		
		System.out.println("===================================================");
		
		Person ps2 = new Person();   //슈붕
		ps2.name = "이정미";
		ps2.height = 165;
		ps2.weight = 70;
		ps2.gender = 'L';
		ps2.married = true;
		
		//비효율적. class에 있는 메서드를 쓰면 1줄이면 된다.
		System.out.println("이름: " + ps2.name);
		System.out.println("신장(키): " + ps2.height);
		System.out.println("몸무게: " + ps2.weight);
		System.out.println("성별: " + ps2.gender);
		System.out.println("결혼유무: " + ps2.married);
		
		Person ps3 = new Person();   //피자붕
		ps3.name = "안진수";
		ps3.height = 169;
		ps3.weight = 72;
		ps3.gender = 'L';
		ps3.married = true;
		
		Person ps4 = new Person();   
		ps4.name = "안세인";
		ps4.height = 158;
		ps4.weight = 69;
		ps4.gender = 'L';
		ps4.married = false;
				
		Person ps5 = new Person();   
		ps5.name = "순소연";
		ps5.height = 161;
		ps5.weight = 55;
		ps5.gender = 'S';
		ps5.married = false;
				
		
		
}
}

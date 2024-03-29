package chapter11.string;

// String 클래스 : 문자열 데이터 관리
public class StringTest1 {

	public static void main(String[] args) {

		//이 표현법은 힙영역에 메모리가 각각 생성된다.
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // 주소비교 결과 false
		System.out.println(str1.equals(str2));  //문자열비교로 true 결과. //equals 는 재정의해서 힙영역의 데이터 값을 비교함.

		System.out.println("==============");
		
		// 이 표현 형태로 사용하면, 힙영역에 "abc"라는 문자열 데이터가 한번이라도 사용이 되어 있으면, 재사용한다.
		// 주소가 동일하게 되는 것이다.
		// 일반적인 작업을 할 때는 아래와 같이 작업한다.
		String str3 = "abc";
		String str4 = "abc";	//  "abc" 기억장소 재사용
	
		System.out.println(str3 == str4); // true   // 일반 변수처럼 작성하면 힙영역에 데이터를 넣기 전에 같은 데이터 영역이 있는지 확인한다. 그 영역이 있으면 새로 생성 안함.
		System.out.println(str3.equals(str4));  // true		
		
	
	}

}

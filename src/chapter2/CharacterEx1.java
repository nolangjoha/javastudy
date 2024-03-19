package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {
		// 문자형 데이터 타입 : char(2)
		// char데이터 타입으로 만든 값은 '' 사용. ""사용하면 안된다.
		// 문자 1개만 코딩해야 한다.
		// 문자로 저장되지만, 내부적으로는 숫자의 의미를 가지고 있다. 
		// 문자로 해석하여 사용된다. 
		// 아스키, 유니코드 사용. 유니코드 값은 0 ~ 65535범위로 사용
			
		// 문자 1개를 저장
		char ch1 = 'A';
		System.out.println(ch1);   // 문자 출력 A
		System.out.println((int)ch1);  // 문자애 해당하는 숫자값(65) 출력
		
		//숫자로 저장
		char ch2 = 66;  //아스키 코드
		System.out.println(ch2);   // 문자 출력  B
		
		int ch3 = 67;
		System.out.println(ch3);  // 숫자 67출력
		System.out.println((char)ch3); //문자C 출력 
		
		
	}

}

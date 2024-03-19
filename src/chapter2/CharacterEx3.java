package chapter2;

public class CharacterEx3 {

	public static void main(String[] args) {

		// char데이터 타입은 유니코드 문자. 즉 0~65535범위를 멋어난 값을 사용 시 문제가 된다.
		
		int a = 65;
		int b = -65;   // 유니코드 값은 0뷰터다. 음수가 없음.
		
		char a2 = 65;  // 숫자로 저장되어도 문자로 사용된다. / 데이터 타입이 char니까
	

		// a변수의 값을 char로 변환해라
		System.out.println((char)a);
		// b변수의 값을 char로 변환해라
		System.out.println((char)b); // b변수값이 -65라는 음수이므로 변환에 해당하는 문자가 없다.
		System.out.println(a2);
		
		
	}

}

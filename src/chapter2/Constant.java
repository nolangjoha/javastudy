package chapter2;

public class Constant {

	public static void main(String[] args) {
		// 상수와 리터럴
		
		// 상수선언 키워드 : final
		// final  데이터 타입
		// 상수이름은 관례상 대문자로 정의한다.
		// 상수이름으로 값을 변경 할 수 없다.
		final int MAX_NUM = 100; //final키워드를 제외하면 변수라고 부른다.
		
		// MAX_NUM = 200;   상수는 값을 변경하면, 에러 발생
		
		final int MIN_NUM;
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		
	}

}

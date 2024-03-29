package chapter2;

public class FloatError {

	public static void main(String[] args) {
		//정수형 데이터 타입보다는 실수형 데이터 타입을 더 큰 범위로 저장하기 위하여
		// 컴퓨터에서는 정수형 데이터표현을 실수형에서는 사용하지 않고, 부동 소수점 방식으로 설계.
		// 정수형 데이터 표현 : 예) 32비트    부호비트 1 + 나머지 비트 31비트
		// 실수형 데이터 표현 : 예) 32비트 	   부호비트 1 + 지수비트 8비트 + 가수비트 23비트
		// 부동소수점 방식으로 실수를 표현하다보면 오차문제가 발생된다.
		// 오차문제는 다른 많은 라이브러리를 통하여, 해결이 가능하다.
		
		System.out.println(0.1 + 0.2); //0.30000000000000004
		// 이 값은 자바, 파이썬, 자바스크립트 등에도 동일하게 나타나는 현상이다. 
		// 저장방식에 문제가 있어 나타난다. (오차발생) 
		
	}

}

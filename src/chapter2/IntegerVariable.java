package chapter2;

public class IntegerVariable {

	public static void main(String[] args) {
		// 정수형 데이터 타입 : byte(1), short(2), int(4), long(8)
		// 크기를 이용하여 기억장소를 생성한다.
		// 예로 byte는 1바이트를 기억장소로 생성한다. 
		// 1byte = 8bit로 구성되어 있다.
		// bit는 0, 1만 사용. 즉, 2진수 값을 저장하도록 설계되어 있다. 
		
		short sVal = 10;
		byte bVal = 20;
		
		System.out.println(sVal + bVal);
		
		//long데이터를 저장 할 경우에는 숫자데이터 뒤에 L ro l을 붙인다.(규칙)
		long lVal = 12345678900L;  
		// 쓸데없는 메모리를 차지하고 있는 비효율적인 코드 1줄로 왼쪽에 경고 표시가 생성되었다.
		// 아래 코드를 활성화 시켜주면 경고 표시가 사라진다.
		System.out.println(lVal);
	}

}

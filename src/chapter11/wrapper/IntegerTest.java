package chapter11.wrapper;


// <Wrapper 클래스>
/*
 기본 데이터 타입을 객체 관점으로 사용할 때 기능을 제공한다.
 
[기본데이터 타입]       [Wrapper 클래스]
 boolean             Boolean
 byte                Byte
 char                Character
 short               Short
 int                 Integer
 long                Long
 float               Float
 double              Double
*/

// 기본데이터 타입은 스택영역만 사용한다.
// 참조 데이터 타입은 스택, 힙 영역 둘다 사용한다.


public class IntegerTest {

	public static void main(String[] args) {

		// <Boxing 과 UnBoxing>
		// Boxing : 기본형을 객체형으로 변환하여 저장하는 것.
		// UnBoxing : 객체형을 기본형으로 꺼내 오는 것.
		
		// 참조타입 클래스 = 기본테이터 타입값;
		// Boxing : 힙영역에 기억장소가 형성되고 기억장소에 데이터가 저장되는 과정. 일종의 형변환이다.
		// 100 데이터가 힙영역에 기억장소를 생성하고, 들어가는 boxing 형변환 과정이 진행된다.
		Integer num = 100;  // Boxing이 진행됐다. 라고 표현.
		int iNum = num.intValue(); //Integer 클래스에서 정수값만 가져옴.     UnBoxing
		int jNum = 200;
		
		int sum = iNum + jNum;
		System.out.println(sum);
		 
		
		
	}

}

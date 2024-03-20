package chapter3.operator;

// ★★★★★ 중요예제 ★★★★★
// 관계연산자 : >, <, ==, >=, <=, !=
// 논리연산자 : &&(논리곱), ||(논리합), !(부정)

public class OperationEx3 {
	// && : 논리and연산자
	// 2개의 입력조건이 true 일때만 결과가 true가 된다. 
	// 1개라도 입력조건이 false가 되면 결과가 false가 된다. 
	// ★★★★★ 좌측의 코드가 false면, 우측코드는 실행되지 않는다. (이렇게 설계된거니까 그냥 외우자)

	// || : 논리or연산자
	// 입력조건 중 1개라도 true이면 결과가 true가 된다. 
	// 2개의 입력조건이 모두 false 일때 결과가 false가 된다. 
	// ★★★★★ 좌측의 코드가 true면, 우측코드는 true or false든 상관없이 결과가 true가 된다. 우측코드는 실행되지 않는다.
	//(이렇게 설계된거니까 그냥 외우자)

	
	
	// 코드가 실행되려면 main()메서드 안에서 작성되어야 한다.
	public static void main(String[] args) {
	
		int num1 = 10;
		int i = 2;
		
		// boolean value = 코드작성;   > true나 false로 해석될 수 있는 코드가 와야 한다.
		boolean value = (num1 = num1 + 10) < 10 && (i = i + 2) < 10;
		       // 해석:                  20 < 10 &&  앞에가 거짓이라 진행 안함.
		
		
		
		// 위의코드가 어떻게 동작되는지를 이해하기 위하여 변수의 값을 출력한다.
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i);  // 우측코드가 실행되면 i변수값은 4가되지만, 실행되지 않는 규칙으로 i변수값은 기존에 설정한 2로 출력된다.
	
		System.out.println("================================================");
		
		value = (num1 = num1 + 10) > 10 || (i = i + 2) > 10;
		System.out.println(value); // true
		System.out.println(num1);  // 30
		System.out.println(i);  // 앞쪽 예제가 먼저 참이 나와 ture가 되어서 뒤에 예제는 진행되지 않는다. 진행해봤자 의미가 없기때문
								// 우측코드가 실행되면 i변수값은 4가되지만, 실행되지 않는 규칙으로 i변수값은 기존에 설정한 2로 출력된다.
		
		
	}

}

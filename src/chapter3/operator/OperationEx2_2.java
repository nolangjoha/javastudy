package chapter3.operator;

// 증감연산자 ++, --
// 변수 앞 또는 변수 뒤에 사용되느냐에 따라 동작(해석)이 달라진다
public class OperationEx2_2 {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
		// 변수++로 사용되면, 변수의 값을 먼저 읽어와서 좌측에 대입하고, 나중에 변수에 +1을 적용한다.
		int lastScore1 = gameScore++; 
		System.out.println(lastScore1); // 대입을 먼저 했기에 150
		
		// 위의 계산으로 나중에 +1되어 gameScore의 상태는 151이 되어 있음.
		
		// 변수--로 사용되면, 변수의 값을 먼저 읽어와서 좌측에 대입하고, 나중에 변수에 -1을 적용한다.
		int lastScore2 = gameScore--;
		System.out.println(lastScore2); // 대입을 먼저했기에 151 
		
		// 위의 계산으로 나중에 -1되어 gameScore의 상태는 150이 되어 있음.

		//확인해보자
		System.out.println(gameScore);
		// 위의 계산으로 인해 gameScore의 상태는 150이 되어 있음.
			
	}

}

package chapter4.loopexample;

// 반복문 : for 무
public class ForExample1 {

	public static void main(String[] args) {

		// 1~100가지의 합을 구하라.
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;   
			//항상 false가 될 수 도 있다는 가정을 해야 한다. 
			//정수형 데이터를 사용할 경우 초기값은 0이다.
		}
		
		System.out.println("1~100까지의 합은?" + sum);
		
	}

}

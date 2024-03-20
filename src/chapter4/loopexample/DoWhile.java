package chapter4.loopexample;

// 반복문 :do~ while
public class DoWhile {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		do {
			sum += i;
			i++;
		}while(i <= 100);
		// do의 코드는 최소 1번은 실행된다.
		// while문 내부가 false는 실행을 멈춘다.
		
		System.out.println("1~100까지의 합은?" + sum);
		System.out.println("i변수의 값은?" + i);
	}
}

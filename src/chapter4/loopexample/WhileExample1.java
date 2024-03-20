package chapter4.loopexample;

//반복문 :while문
public class WhileExample1 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
			
		System.out.println("1~100까지의 합은?" + sum);
		System.out.println("i의 변수밧은?" + i);
		
		
		
	}

}

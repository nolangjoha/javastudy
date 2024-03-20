package chapter4.loopexample;

//중지.
public class BreakExample {
	
	public static void main(String[] args) {
	
		int i = 0;  // i를 여기서 선언하면 for문이 끝나도 사용 가능
		
		for(i = 0; i <= 10; i++) {
		//	if(i % 2==0) {  // 이거 짝수라는 의미
			System.out.println(i);
			// 아래 구문이 true가 되어 break문이 실행되면, for문이 종료 된다. 
			if(i==5) {
				break;
			}
		
		}
	}
}
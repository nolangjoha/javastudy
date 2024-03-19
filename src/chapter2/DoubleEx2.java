package chapter2;

public class DoubleEx2 {

	public static void main(String[] args) {
		// 실수 데이터타입이 부동소수점 방식으로 표현하여, 오타를 일으키는 예제
		double dnum = 1; // 1D or 1d
		
		for(int i=0; i<10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);  //1001.000000000159
		
	}

}

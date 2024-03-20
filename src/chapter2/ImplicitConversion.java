package chapter2;

 // 형변환(Casting) : 데이터 타입 변환
 // 묵시적 형변환

public class ImplicitConversion {

	public static void main(String[] args) {
		
		// 정수데이터 타입 크기순서 byte(1) -> short(2) -> int(4) -> long(8) 
		
		byte bNum = 10; // 크기 1바이트
		// 1바이트 10이 4바이트 10으로 형변환 되어 좌측타입과 일치되어 변수에 대입된다.
		int iNum = bNum;  // 4바이트 = 1바이트     해석 : int iNum = (int) bNum;s
		                  // 1바이트가 4바이트로 형변환 된다.
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		// 정수데이터 타입보다는 실수데이터 타입이 크다(설계가 그리되어있음.)
		
		int iNum2 = 20;
		float fNum = iNum2;  // 해석 : float fNum = (float) iNum2
		
		System.out.println(iNum2);  //20
		System.out.println(fNum);  //20.0f
		
		
		double dNum;
		
		// 우측의 연산코드도 큰 데이터 타입으로 변환되어 연산된다.
		dNum = fNum + iNum; // 해석: (float) + (int) -> (float)+(float)
		
		System.out.println(dNum);  	
		
	}

}

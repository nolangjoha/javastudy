package chapter2;

// 형변환(Casting) : 데이터 타입 변환
// 명시적 형변환
public class ExplicitConversion {

	public static void main(String[] args) {
		
		//<묵시적 형변환>
		// 큰데이터 타입 = 작은데이터타입 (가능)
		
		//<명시적 형변환>
		// 작은데이터 타입 = 큰데이터 타입 (불가능) -> 작은데이터타입 = (좌측데이터타입)큰데이터타입 (가능)
		
		double dNum1 = 1.2; // 해석 double dNum1 = 1.2d;
		float fNum2 = 0.9f;  //d는 생략되는데 f는 생략 안됨.
		
		int iNum3 = (int) dNum1 + (int)fNum2;   
		// 원래 (ing) = (double) 오른쪽이 왼쪽보다 크다.. 왼쪽에 넣을 수 없다.
		// 이때 우측의 데이터 타입을 좌측과 같게 해준자(int)를 넣어준다. 
		// 그런데 이때 실수타입을 정수타입으로 만든것이므로 소수점 아래 데이터가 날아간다.
		// 반올림 없음. 소수부분은 무조건 버림.
		// 예) (int)0.9f -> 0 
		
		System.out.println(iNum3);   // 1
		
		
		int iNum4 = (int)(dNum1 + fNum2);  
		// (int) (1.2d + 0.9d)로 대입 > int iNum4 = 2.1d
		
		//모든 소수타입을 바꾼다고해서 문제가 생기는 것은 아니다.
		// 순환수소를 정수타입으로 바꾸려 할때 에러가 발생할 수 있다. 
		
		System.out.println(iNum4); //  2
		
	}

}

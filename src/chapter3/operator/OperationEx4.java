package chapter3.operator;


// 조건 연산자(삼항연산자) : if 문과 유사
public class OperationEx4 {

	public static void main(String[] args) {
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;  // 숫자로 사용시 0 ~ 65,535범위를 갖는다. (암기)
		// ch = 문자코드표현  -> 
		// ch='a' 문자는 1개만, 만약'av'2개가 들어가면 안된다. / '유니코드소스'유니코드는 들어갈 수 있음.
		ch = (fatherAge > motherAge) ? 'T':'F'; // 예제가 참이면 T가 대입, 거짓이면 F가 대입
		
		System.out.println(ch); //F
	}
}

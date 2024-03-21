package chapter5.classpart;

//메서드 정의하기.
//메서드 : 기능을 구현하는 코드로 구성된 것. 
public class FunctionTest {
	//JRE실행 > JRE 내 JVM이 main메서드 안에있는 코드를 찾아 실행시킽다.(JVM :자바 가상머신)
	/* 메서드 기본구조
	   리턴타입 메서드이름 (매개변수 선언) {
	       	...
	  		...
	  		...
	  		return 사용유무;
		}
     - public static : 메서드를 만드는데 무작정 사용하진 않는다/ (자세한건  나중에 설명)
	 - void : 리턴타입
 	 - main : 메서드 이름.
	 - (string[] args) : 매개변수
	 */
	
	// main() 메서드 : 자바에서 프로그램 실행을 목적으로 제공해주는 것.
	public static void main(String[] args) {  
		int n1 = 10;
		int n2 = 20;
		
		int sum = add(n1, n2);
		System.out.println(n1 + " + " + n2 + " = " + sum + "입니다.");	
		
		int d = substract(n1, n2);
		System.out.println(n1 + " - " + n2 + " = " + d + "입니다.");
		
		int e = multiply(n1, n2);
		System.out.println(n1 + " * " + n2 + " = " + e + "입니다.");
		System.out.println(n1 + " * " + n2 + " = " + multiply(n1, n2) + "입니다.");

		n1=2;
		n2=3;
		
		double f = devide(n1, n2);
		System.out.println( n1 + "/" + n2 + " = " + f + "입니다.");
	}
	
	// 2개의 값을 매개변수로 제공받아 더한 값을 리턴하는 메서드.
	// 예 > 10 + 20 =30
	public static int add(int num1, int num2) {
		// 2개의 값을 더하는 코드 작성.
		int result = num1 + num2;
		return result;
	}
	
	//뺄셈
	public static int substract(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}


	//곱셈
	public static int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
	
	//나눗셈 : 반환값을 int로 하면 소수점은 버려진다.
	public static double devide(int num1, int num2) {
		// 정수끼리 연산하면 결과는 정수 예>정수+정수=정수
		// 정수와 실수끼리 연산하면 결과는 실수 예>정수+실수=실수/ 해석> (실수데이터타입)정수+실수=실수
		// 실수끼리 연산하면 결과는 실수 예> 실수+실수=실수
		double result = (num1 + num2)/2.0;
		return result;
		
	}
	

}

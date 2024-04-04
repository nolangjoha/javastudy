package chapter13.lambda;

//함수형인터페이스 : 추상메서드 단 1개를 가지고 있는 인터페이스
//@FunctionalInterface : 인터페이스가 추상메서드 1개일 경우에만 사용 가능./ 명시적으로 표시해서 실수를 줄이자
@FunctionalInterface //@이름 : Annotation
public interface MyNumber {
	
	//추상메서드
	int getMax(int num1, int num2);
	
	//아래 함수형 추상메서드를 하나더 추가하면 에러 발생 > 5행을 없애면 에러가 사라짐.
//	int sum(int a, int b);
}

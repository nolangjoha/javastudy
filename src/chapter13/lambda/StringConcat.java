package chapter13.lambda;

//<인터페이스>
//객체생성 불가능
//상속을 목적으로 하는 설계도

/*
함수형인터페이스 : 추상메서드 단 1개를 가지고 있는 인터페이스 
  >> 람다식 분법을 사용 할 수 있다. 
*/

@FunctionalInterface
public interface StringConcat {
	
	public void makeString(String s1, String s2);	
}

package chapter13.lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// 구현클래스를 객체 생성하여 사용.
		
		String s1 = "Hello";
		String s2 = "World";
		
		//1) StringConcat인터페이스를 구현한 클래스 (기본적인 사용 형태)
		//   3)과 달리 StringConCatImpl클래스에서 호출해서 가져와 다양한 객체 생성 가능
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);
		
		//2) String concat 함수형 인터페이스 이므로 makeString()추상메서드를 람다식 문법으로 구현.
		//   합수형인터페이스 일때는 중간에 클래스과정 건너뛰고 인터페이스 > 람다식으로 바로 표현 가능
		StringConcat concat2 = (String s, String v) -> System.out.println(s1+ "," + s2);
													//{System.out.println(s1+ "," + s2);};
													//명령이 1줄이면 중괄호를 지워도 됩니다.	
		concat2.makeString(s1, s2);
		
		//3) 익명구현객체로 사용(일회용)
		//   중괄호 내 코드들 여기서만 존재하는 코드이므로 다른파일에서 아래 내용 호출이 불가함.
		StringConcat concat3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {		
			}
		};
		concat3.makeString(s1, s2);		
	}

}

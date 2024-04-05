package chapter13.lambda;

//구현(implements) 클래스
//클래스의 목적 : 객체 생성
public class StringConCatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1+ "," + s2);
		
	}

}

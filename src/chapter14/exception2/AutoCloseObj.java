package chapter14.exception2;

//AutoCloseable 인터페이스 학습
//AutoCloseable은 try에 선언된 객체가 AutoCloseable을 구현했더라면 Java는 try구문이 종료될 때
//객체의 close() 메소드를 호출해 준다.

public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다.");
		
	}

}

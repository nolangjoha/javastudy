package chapter14.exception;

public class NullException2 {
	
	public static void main(String[] args) {
		
		//참조타입은 기본값을 보통 null을 사용한다.
		String str = null;
		
//		System.out.println(str.toString());		
		
		//예외처리
		try {
			System.out.println(str.toString());
		}catch(NullPointerException ex) {
			ex.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}

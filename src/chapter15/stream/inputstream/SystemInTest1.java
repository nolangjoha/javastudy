package chapter15.stream.inputstream;

import java.io.IOException;

//표준입출력 스트림: 키보드로 입력받고, 화면(모니터)에 출력하는 기능을 지원목적. //이건 언어마다 다 있는 기능이다.(자바스크립트엔 없다)
/*
 표준입력스트림:System.in
 표준출력스트림:System.out
 표준에러스트림:System.err
 */
public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("알파벳 하나를 입력하고, [Enter]를 누르세요.");
		
		int i;
		
		//예외처리 문법
		try {
			
			//System.in.read();구문이 실행되면, 사용자가 키보드로 입력할 수 있는 대기상태를 지원해준다.
			//키보드로 입력하고 Enter를 치면, 입력한 데이터가 버퍼라는 임시기억장소에 저장된다.
			//System.in 표준 입력스트림이 읽어온다.
			i = System.in.read();  //read()메서드가 예외 관련 작업을 하도록 문법이 존재한다. 그래서 try~catch 예외처리를 함.
			
			
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}

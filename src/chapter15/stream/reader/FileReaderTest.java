package chapter15.stream.reader;

import java.io.FileReader;
import java.io.Reader;

// 문자기반의 스트림 예제.
// Reader : 문자기반의 입력 스트림 최상위 추상클래스
public class FileReaderTest {

	public static void main(String[] args) {
		
		//try 괄호 사이에 객체를 생성하면 close()메서드를 사용할 수 있다.
		// "reader.txt"의 내용을 읽어오기 위한 문자기반의 입력스트림 객체를 생성했다. 객체의 이름은 fr  < 이게 빨대임.연결통로 
		try(Reader fr = new FileReader("reader.txt")) {
			
			int i;
			
			while((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}

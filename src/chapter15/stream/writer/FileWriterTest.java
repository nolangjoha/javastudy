package chapter15.stream.writer;

import java.io.FileWriter;
import java.io.Writer;

// 문자기반의 스트림 예제.
// Writer : 문자기반의 출력스트림 최상위 추상클래스
public class FileWriterTest {

	public static void main(String[] args) {

		// 출력스트림 객체가 생성되면, 파일이 생성된다.
		try(Writer fw = new FileWriter("writer.txt", true)) {  // true를 입력하면 실행 할 때마다 내용을 계속 추가 시킬 수 있다. , 이게 없으면 파일이 계속 새로 생김

			// 1개의 문자를 파일에 쓰는 작업
			fw.write('A');
			
			//배열로도 출력이 가능하다.
			char[] buf = {'B','C','D','E','F','G'};
			fw.write(buf);
			
			// 문자열로 출력
			fw.write("\n동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라만세");	
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}	
		System.out.println("출력완료");
	}
}

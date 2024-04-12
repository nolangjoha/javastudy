package chapter15.stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 버퍼기능을 제공하는 보조스트림을 사용할 경우 속도체크
// "a.zip" 파일을 읽어서 "copy.zip"파일을 생성하여 쓴느 작업(파일 복사)
public class BufferedStreamTest {

	public static void main(String[] args) {

		long milisecond = 0;  // 시간체크용 변수.
		
		try(
				FileInputStream fis = new FileInputStream("a.zip");  //"a.zip" 파일 준비.
				FileOutputStream fos = new FileOutputStream("copy.zip"); // 객체 생성이 되면, 자동으로 "copy.zip"파일이 생성
				
				// 버퍼 보조스트림 객체생성.
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				) 
		{
			// 파일복사 작업이 시작하기 전 1970년 1월 1일 00시 00분 00초에서 현재 날짜와 시간이 흐른 누적된 시간을 밀리세컨드로 반환.
			milisecond = System.currentTimeMillis();
			
			//파일복사. 입력스트림(fis)으로 a.zip파일의 내용을 읽어와서, 출력스트림(fos)으로 copy.zip파일에 내용을 쓰는 작업
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			} 
			
			//파일복사 작업이 종료된 시간
			milisecond = System.currentTimeMillis() - milisecond;
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사시간 : " + milisecond + " ms 소요됨.");
		
		
		
		
	}

}

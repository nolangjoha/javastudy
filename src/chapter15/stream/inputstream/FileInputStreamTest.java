package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//입출력 스트림을 바이트 단위로 작업하는 예제
// input.txt파일의 내용을 읽어오는 작업.
public class FileInputStreamTest {

	public static void main(String[] args) {
		
		//읽기(입력), 바이트 단위, 파일 = FileInputStream()
		FileInputStream fis = null;

		//예외처리
		try {
			// fis 객체 : 연결통로(빨대)  
//			fis = new FileInputStream("C:\\Dev\\Lecture\\JavaWork\\study\\bin\\chapter15\\stream\\inputstream\\input.txt");
			fis = new FileInputStream("input.txt");  //input.txt 파일이 존재하지 않으면, 예외가 발생되기 때문에 문법적으로 예외작업 규칙이 존재한다.
			//이 파일은 프로젝트 파일아래 놔둬야 읽힌다.
			
			System.out.println((char)fis.read());	//a
			System.out.println((char)fis.read());	//b
			System.out.println((char)fis.read());	//c
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("프로그램 종료");
	}
}

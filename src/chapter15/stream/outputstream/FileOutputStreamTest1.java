package chapter15.stream.outputstream;


import java.io.FileOutputStream;
import java.io.IOException;

//바이트단위로 작업하는 출력스트림 예제
public class FileOutputStreamTest1 {

	public static void main(String[] args) {

		//true: output.txt 파일명이 존재하면, 기존 파일에 추가해준다.
		// 파일이 존재하지 않으면 새로 생성한다.
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			
			fos.write(97);  //A
			fos.write(98);  //B
			fos.write(99);  //C   //아스키코드 하나하나 확인하기 어렵기에 이렇게 작업은 안한다. 이건 예제니까:D			
			
		}  catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력완료");
	}

}

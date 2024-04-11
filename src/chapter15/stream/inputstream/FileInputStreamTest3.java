package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//바이트 단위로 작업
//파일의 내용을 배열을 사용하여, 10바이트씩 읽어오기

// 텍트스 파일은 바이트 단위 작업보다는 일반적으로 문자단위 작업을 한다.
public class FileInputStreamTest3 {

	public static void main(String[] args) {
													//아래 파일은 프로젝트 파일 밑에 있어야 정상적으로 읽어올 수 있다.	
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			byte[] bs = new byte[10];
			
			int i ;
			
			//fis.read(bs): 10바이트씩 읽어와서 bs에 저장. []속 숫자 만큼 읽어온다 /[100]이면 100바이트
			while((i= fis.read(bs)) != -1) {
				for(int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}	
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}

}

package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일의 내용이 끝인지 아닌지를 while문으로 확인하여, 끝까지 읽어오는 예제
public class FileInputStreamTest2 {

	public static void main(String[] args) {

		//try(): 객체를 자동생성하면, 자동으로 close()메서드가 내부적으로 호출된다.
		//단, 사용 클래스는 closeable 인터페이스를 상속받아야 한다. 
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			
			int i;
			
			//read()메서드가 읽어온 값이 없을 때 -1을 리턴한다.
			//문자하나를 읽어오고, 다음 문자 위치로 포인터를 이동하는 기능을 제공한다.
			//화이트 스페이스 : 키보드상에서 기능은 있지만 화면에 잘 보이지 않것, tab, enter등 
			//read() : 1byte씩 읽기
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

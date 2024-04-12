package chapter15.stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 보조스트림
// DataInputStream, DataOutputStream
// 데이터타입 크기를 사용하여 읽고, 쓰는 작업을 할 때 사용.
public class DataStreamTest {

	public static void main(String[] args) {

		try(	
				//메인스트림
				FileOutputStream fos = new FileOutputStream("data.txt");  //출력스트림 객체 : 매개변수로 한 파일이 자동 생성된다.(0바이트)
				//보조스트림
				DataOutputStream dos = new DataOutputStream(fos); //데코레이션패턴 : 위에 객체명을 매개변수로 넣는다.
				) {
			
				//읽어오는 것을 생각하면 저장순서가 중요하다. / 이 내용들이 "data.txt" 파일 내부에 쓰여진다. /데이터타입의 성격대로 쓰여짐.
				dos.writeByte(100);  
				dos.writeChar('A');
				dos.writeInt(10);
				dos.writeFloat(3.14F);
				dos.writeUTF("Test");
				
		}catch(Exception e) {
			
		}
			
		//입력스트림 작업
		try (
				//메인스트림
				FileInputStream fis = new FileInputStream("data.txt");
				//보조스트림
				DataInputStream dos = new DataInputStream(fis);
			) {
				
			//저장된 순서대로 읽기작업
			System.out.println(dos.readByte());
			System.out.println(dos.readChar());
			System.out.println(dos.readInt());
			System.out.println(dos.readFloat());
			System.out.println(dos.readUTF());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}
}

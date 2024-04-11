package chapter14.exception2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 예외전가(예외처리 미루기)
public class ThrowsException {

	//메서드를 호출한 쪽으로 예외가 넘어간다.
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		
		// multi catch 사용시 여러 예외가 발생한 경우, 가장 큰 예외클래스가 맨마지막에 사용해야 한다.
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

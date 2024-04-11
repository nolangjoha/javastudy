package chapter14.exception2;

//예외전가(예외처리 미루기)
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 예외전가(예외처리 미루기) : 메서드 안에서 예외가 발생 시 자체 예외처리를 하지 않고 호출한 쪽으로 다시 예외를 돌리는 것을 말함.
public class ThrowsException2 {

	//예외처리를 한 상태.
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException  {
		Class c = null;
		
		FileInputStream fis = new FileInputStream(fileName);
		c= Class.forName(className);
		return c;
		
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		ThrowsException2 test = new ThrowsException2();
		
		//이 메서드가 호출하면서, 예외전가에 의하여, 예외를 받으면, 현재 이 코드에서 예외처리를 해줘야 한다.
		try {
		test.loadClass("a.txt", "java.lang.Strint");
		}catch (FileNotFoundException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}catch (Exception ex) {  
			//최상위 예외 클래스는 마지막에 작성해야 한다.
		}
		
		
		
	}

}

package chapter15.stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 직렬화 및 역직렬화 예제.

//직렬화조건
//java.io.Serializable인터페이스를 상속받은 객체는 직렬화할 수 있는 기본조건입니다

class Person implements Serializable{
	
								// serialVersionUID 자체가 키워드
	private static final long serialVersionUID = -5680873767446443502L;
	String name;
	transient String job;  // transient 직렬화 대상에서 제외
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
	
}

public class SerializationTest {

	public static void main(String[] args) {

		//직렬화로 사용할 객체 생성
		Person personHong = new Person("홍길동", "의적");
		Person personSon = new Person("손흥민", "축구선수");
		
		try(
				FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos); //직렬화 작업으로 사용할 보조스트림.
				) {
			
				// 직렬화 작업
				oos.writeObject(personHong);  // personHong객체 상태를 "serial.out" 에 저장. 위에서 transient 태그가 있으면 job필드는 제외
				oos.writeObject(personSon);	  // personSon객체 상태를 "serial.out" 에 저장. 위에서 transient 태그가 있으면 job필드는 제외
				
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//Person 클래스가 변경전에 직렬화 작업을 하고, 역직렬화 작업 전에 Person 클래스가 변경이 되었을 때
		//역직렬화 할때 클래스의 상태가 달라서 에러가 발생한다.
		
		//역직렬화로 사용할 객체 생성
		try(
				FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis);
				)
		{
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		}catch(Exception e) {
			
		}
		
		
		
		
	}
}

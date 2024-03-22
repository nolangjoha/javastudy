package chapter5.hiding2;

import chapter5.hiding.MyDate;

//default필드는 다른 패키지에서는 접근 불가능. private 처럼 실행된다.
public class MyDateTest {

	public static void main(String[] args) {
		//다른패키지의 클래스를 참조할 때
		//패키지명.파일명
		//chapter5.hiding.MyDate date1 = new MyDate();
		//그러나 위와 동일한 방법으로 객체를 계속 만드는건 비효율적.
		
		//  import chapter5.hiding.MyDate;라 쓰면 MyDate만 쓰면 된다.
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate();
		MyDate date3 = new MyDate();
		MyDate date4 = new MyDate();
		MyDate date5 = new MyDate();
		
		
		date1.day = 1;
//		date1.month = 10; // 디폴트는 private
	
	}

	
	
}

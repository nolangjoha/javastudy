package chapter5.hiding;


//MyDate 클래스를 사용하는 현재 입자에서 동일한 패키지 일 경우 디폴트 이상은 접근이 가능하다.
//default필드는 동일한 패키지일경우 접근 가능
public class MyDateTest {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.day = 1;
		date.month = 10;
//		date.year = 2024;   private 접근자로 되어있기 때문에 접근이 안되는 특지이 있다.
		
		
		
	}
	
}

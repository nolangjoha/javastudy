package chapter6.thisex;

// this 키워드 
class BirthDay {
	//아래 3개의 필드는 접근자가 생략되어 있으므로 default 라고 한다.
	// default 는 동일한 패키지에서는 접근이 가능하다. (public)
	int day;
	int month;
	int year;
	
	//year 필드에 대한 setter 메서드 (setter 메서드는 public 로 하는게 규칙)
	public void setYear(int year) {
		this.year = year;
	}
	
	//this : 힙 영역에 생성되는 BirthDay 클래스 객체.
	public void printThis() {
		System.out.println(this); 
	}
	
} 
// 파일이 1개지만 class 가 2개다.
// 근데 이건 학습상 이렇게 하는거고 보통 작업 할땐 class 는 별도로 만든다.
// 큰 문제는 없는데 이렇게 만든다면 귀찮아서 1개의 파일로 만든것 ㅇㅅㅇ!



public class BirthDayTest {

	public static void main(String[] args) {
		 
		BirthDay bDay = new BirthDay();
		//bDay.year = 2024;
		bDay.setYear(2024);
		
		System.out.println(bDay);  //chapter6.thisex.BirthDay@75a1cd57
		bDay.printThis();          //chapter6.thisex.BirthDay@75a1cd57
		//
		
	}

}

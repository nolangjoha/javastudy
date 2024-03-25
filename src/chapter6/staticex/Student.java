package chapter6.staticex;

//JVM이 운영체제로부터 메모리 할당을 위임받아, 자바프로그램을 실핼할 때 사용되는 메모리의 영역을 학습하는 예제.
//static area(method area) : 정적영역(정적필드) = 클래스 변수
public class Student {

	//필드선언
	//필드가 private접근자일 때문 getter/setter메서드를 정의한다.
	//문법 : 접근자 [static 선택] 데이터타입 변수;
	//선택적으로 해당구문을 넣을 수 있다.
	//자바 프로그램이 실행되면 JVM이 클래스의 내용을 보고, static 키워드를 사용하는 필드, 메서드에 대하여 static area메모리를 생성한다.
	static int serialNum; //static 필드를 접근하는 메서드는 static 이어야 한다.
	
	//인스턴스(instance) 필드: Student stu1 = new Student(); 객체생성구문이 실행이 될 때만 stack, heap 영역의 메모리를 사용.
	//책은 예제의 단숨함을 위하여, 필드의 접근자를 public 을 사용했으나, 실제 개발에서 필드는 private, public getter/setter 메서드를 사용한다.
	int studentId;
	String studentName;
	int grade;
	String address;
	int count;
	
	//getter메서드 : studentName필드로 생성된 기억장소의 값을 읽어오기 위한 목적의 메서드
	public String getStudentName() {
		return studentName;
	}
	//setter메서드
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	//3개 필드에 대한 getter/setter메서드 선언: setter 메서드 앞엔 무조건 void기입
	//get,set메서드를 만들때 보통 필드 앞에는 private이 붙는다.
	//int grade;
	public int getGrade(){
//		serialNum++ 사용가능. static 필드 또는 메서드 JVM이 자동으로 메모리를 생성해주기 때문, 인스턴스 메서드가 호출이 된다면, 먼저 생성되어 있는 메모리 접근이 당연하므로 문제가 안된다.
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	//String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	//int count;
	public int getCount(){
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	//static int serialNum;
	public static int getSerialNum() {
		//return Student.serialNum;
		//static필드는 class명.static필드로 기억장소를 접근한다.
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
		//static필드는 class명.static필드로 기억장소를 접근한다.
	}
	
}

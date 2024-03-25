package chapter6.staticex;

public class StudentTest {

	public static void main(String[] args) {
		//JVM이 main()메서드를 호출하면서, 프로그램이 실행될 때, Student클래스의 Static필드와 메서드를 이용하여,
		//static area에 단, 1번만 메모리를 생성.
		//new등 객체 등이 생성되진 않았으나 실행 시키면 표시되진 않지만 주석이 읽히는 실행이 있었다.
		
		Student stu1 = new Student(); //스택영역과 힙영역에 메모리 생성
		stu1.setStudentName("손흥민");
		//static 메서드는 믈래스명. 메서드명() 호출해야 한다. 객체. 메서드명()으로 호출은 되나, 사용하지 말것.(자바가 잘못 만들었음.)
		Student.getSerialNum();
		//static명은 클래스명으로 호출해야한다.(암기)
		System.out.println(Student.getSerialNum()); //1
		
		Student stu2 = new Student();//스택영역과 힙영역에 메모리 생성
		stu2.setStudentName("김민재");
		Student.getSerialNum();//2 
		
	}

}

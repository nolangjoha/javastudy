package chapter5.classpart2;

public class StudentTest1 {

	public static void main(String[] args) {
		
		/*
		  메모리구조 : https://lucas-owner.tistory.com/38(참고용)
		 
		운영체제로부터 JVM이 메모리 할당을 위임받아서 메모리를 여러개의 영역으로 나누어 관리한다.
		
		메모리 영역 : 여러개로 나누어 진다.
		① Heap Area ②Stack Area ③ Method Area(Static Area) /암기★★★	
		
		 - Stack Area : 
		   메서드 안에 변수 및 매개변수를 선언하면, 메서드가 실행이 될 때 변수의 기억장소가 생성.
		   또 Student stu1; 클래스로 객체를 선언하면, 이 영역에 기억장소가 생성		                        
		  Heap Area: 클래스로 객체를 선언하고 실행이 될 때 이 영역에 기억장소가 생성된다.
		 - Heat Area: new키워드가 클래스의 내용을 가지고 이 영역에 기억장소가 생성
		*/
		
		//객체생성
		// new : 힙영역의 공간에 메모리(기억장소)를 생성하는 연산자.
		Student stu1 = new Student();  // Student()는 생성자 라고 한다.
		//Student stu1 : 객체선언, stu1 = new Student(); : 객체 생성 
		stu1.studentName = "손흥민";
		
		Student stu2 = new Student();
		stu2.studentName = "이강인";
		
		
		//chapter5.classpart2.Student@75a1cd57 : 패키지명.클래스명@주소값
		// 주소값=해키보드(hash code)값이라고도 한다.
		// 패키지명 : chapter5.classpart2 , 클래스명.주소값 : Student@75a1cd57
		System.out.println(stu1); //chapter5.classpart2.Student@75a1cd57
		System.out.println(stu2); //chapter5.classpart2.Student@515f550a

			
	} 

}

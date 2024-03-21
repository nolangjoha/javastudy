package chapter5.classpart2;

//Student 클레스에 main() 메서드 사용하기.
public class Student {

	//학생정보
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//메서드
	public String getStudentName() {
		
		return studentName;
	}
	
	//main()메서드는 Student 클래스의 멤버가 아니다. 이렇게 쓰는 건 특수 상황
	// 이 예제는 이렇게 쓸수도 있다는 걸 보여주기 위해 공부용으로 작성된 것. 
	// 보통 개발할 때 class 안에 메인 메서드를 넣진 않는다.
	// 일반적으로 main()메서드를 독립적인 파일로 사용한다. 
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.studentName = "홍길동";
		
		//"홍길동이 저장된 데이터 출력
		// 실제 작업을 하는 경우에는 필드를 직접사용하지 않고 메서드를 이용하여 필드값을 읽어온다.
		System.out.println(stu1.studentName); // 필드사용(직접접근)
		System.out.println(stu1.getStudentName()); //메서드사용 (1번 거쳐서 접근) - 실무에서는 이렇게 쓴다. 접근자라는 문법 때문
				 
	}

}

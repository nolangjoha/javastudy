package chapter5.hiding;

public class StudentTest {

	public static void main(String[] args) {
		//객체생성작업
		//s1 객체(스택영역)에는 new Student() 힙 영역의 생성된 기억장소의 주소가 저장된다.
		Student s1 = new Student();
		
		s1.address = "노원구";
		s1.sutdentId = 1;
		s1.grade = 5;
		s1.studentName = "홍길동";  
		// hiㅇing.Student의 String studentName 앞에 private 작성하면 해당 코드가 활성화 되지 않는다.
		
		//private score 필드는 접근금지
	//	s1.score  = -23;  아예 사용 못하게 막는 것이다.
		
		s1.setScore(200);
		
		System.out.println(s1.getScore());
		
				
	}

}

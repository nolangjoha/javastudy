package chapter5.reference;

//학생 성적 정보를 관리하는 클래스
public class Student2 {

	
	int studentId;  //학번  .. 기본데이터타입
	String studentName;  //학생이름 .. String class: 참조타입
	int koreaScore;  //국어점수  .. 기본데이터타입
	int mathScore;  // 수학점수  .. 기본데이터타입
	String koreaSibject;  // 국어과목 이름
	String mathSubject; // 수학과목 이름
	
	// ? 과목점수, 과목이름 계속 추가된다면?  아래에 계속 추가될텐데 이건 효율적이지 않다. 
	// 답 : 이름,과목의 특성을 가진 클래스를 새로 만든다.
	
	
}

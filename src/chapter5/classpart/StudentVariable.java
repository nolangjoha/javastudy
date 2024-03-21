package chapter5.classpart;

public class StudentVariable {

	public static void main(String[] args) {
		// 학생관련 정보
		// 학번, 이름, 학년, 주소지
		
		int studentID;
		String studentName;
		int grade;
		String address;
		
		studentID = 1;
		studentName = "홍길동";
		grade = 4;
		address = "노원구";
		
		System.out.println("학번은?" + studentID);
		System.out.println("이름은?" + studentName);
		System.out.println("학년은?" + grade);
		System.out.println("주소는?" + address);
		
		System.out.println("=========================");
		
		int studentID2;
		String studentName2;
		int grade2;
		String address2;
		
		studentID2 = 2;
		studentName2 = "손흥민";
		grade2 = 5;
		address2 = "서대문구";
		
		System.out.println("학번은?" + studentID2);
		System.out.println("이름은?" + studentName2);
		System.out.println("학년은?" + grade2);
		System.out.println("주소는?" + address2);
	}
	
	//어제까진 이렇게 했는데.. 학생이 100명이라면..? 이 작업을 100번씩..?

}

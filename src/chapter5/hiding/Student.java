package chapter5.hiding;


// 정보은닉(캡슐화) : 접근자 문법
public class Student {

	int sutdentId;
	String studentName;
	int grade;
	String address;
	private int score;
	// 스프링에서는 저 위에 필드앞에 private 를ㄴ 모두 작성하더라
	
	
	//생성다: 기본생성자는 자동생성
	
	//메서드
	//setter, getter 메서드는 이름을 반드시 다음과 같은 규칙으로 만들어야 한다.
	//score필드에 값을 저장. setter메서드
	//(규칙)setScore()  : set+메서드명(첫자대문자) ()   
	//(규칙)getScore()  : get+메서드명(첫자대문자) () 
	// 자바는 괜찮지만 다른 프로그램에서는 private에 접근/수정하는 메서드 명을 마음대로 만들면 작동을 안하게 된다.
	// 요구하는 규칙이 있으니 주의 할 것
	public void setScore(int score) {
		if(score < 0 || score >= 100) {
			this.score = 0;
			return;
		}
			
		this.score = score;
	}

	//score필드에 값을 읽기. getter메서드
	public int getScore() {
		return score;
	}
	
}

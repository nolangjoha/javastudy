package chapter5.classpart;

public class UserInfoMain {

	public static void main(String[] args) {
		
		UserInfo user1 = new UserInfo();  //객체생성
		user1.name = "안선영";  // 여기 데이터 값을 넣어주는건 spring이 해줄거다. (user가 회원가입을 위해 입력한 정보)
	}// 회원가입페이지로 사용자 데이터를 입력 받아 UserInfo클래스의 객체에 저장된다.
	// 스프링을 통하여, 객체가 가지고 있는 데이터를 데이터 베이스에 저장하게 된다.

}

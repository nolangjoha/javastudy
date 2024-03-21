package chapter5.classpart;


//일반 개인정보를 저장하기 위한 데이터 타입
// 개인정보 : 이름, 신장(키), 몸무게, 성별, 결혼유무
public class Person {

	//변수설계. -> 클래스 내 변수라 지칭했던 것을은 '필드'라 명명한다.
	// 필드 : 기억장소
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	// 메서드 : 필드가 만든 기억장소에 접근해서 데이터를 이용한 기능목적. 재사용성!
	public void getPersonInfo () {
			System.out.println("이름: " + name);
			System.out.println("신장(키): " + height);
			System.out.println("몸무게: " + weight);
			System.out.println("성별: " + gender);
			System.out.println("결혼유무: " + married);
			
	}
	
}

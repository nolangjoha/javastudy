package chapter6.singleton;

// 디자인 패턴 중 싱글톤 패턴으로 구성하는 클래스이다.
// 아래와 같이 사용하라는 싱글톤 패턴 가이드이다. (규칙 아님)
// 싱글톤 패턴 디자인 : 단 하나의 객체만 생성을 하고자 하는 목적.
public class Company {
	
	//1) 클래스 안에서 자기자신을 private static 멤버로 객체생성.
	private static Company instance = new Company();
	//static성격으로 instance객체는 static영역에 들어있다. 
	
	//2) 생성자를 디폴트 생성자를 생성되지 않게, private접근자를 사용.
	private Company() {}
	//싱글톤은 private 성격을 꼭 넣어달라고 한다.

	//3)public getter 메서드 정의 : instance가 private이므로 클래스 외부에서 접근이 막아져 있으므로 getter메서드 사용.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}





}

package chapter14.exception;

class Person{
	int a;
}

public class NullException {

	public static void main(String[] args) {

		Person ps = null;  		//null : 힙영역에 기억장소를 할당하지 않은 상태.참조 주소가 없다.
//		ps = new Person();      //정상적으로 객체가 있으면 참조가 가능하여 정상실행된다.

		try {
			System.out.println(ps.toString());  //ps.은 무언가를 참조하겠다는 건데 2개 윗줄로 인해 ps를 참조할 수 없는 상태이므로 에러 발생 
			System.out.println(ps.a);	// 바로 위의 행과 동일한 이유로 에러 발생
			System.out.println("프로그램 실행 중 ");
		}catch(NullPointerException ex) {		//Exception : 예외 관련 클래스 중 최상위 클래스
			System.out.println(ex);
			System.out.println("예외발생");
		}
		System.out.println("프로그램종료");
		}

}

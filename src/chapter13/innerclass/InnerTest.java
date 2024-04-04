package chapter13.innerclass;

//외부클래스
class OutClass{
	//인스턴스 필드
	private int num = 10;
	//스태틱필드
	private static int sNum = 20; // static 객체생성 전(객체생성과 상관 없이)기억장소 자동생성
	
	//내부 클래스를 필드 선언해서 사용가능
	private InClass inClass;
	
	//생성자
	public OutClass() {
	
		inClass = new InClass(); // 내부클래스 객체생성
	}
	
	//내부클래스1 : 외부클래스(OutClass)의 멤버들을 직접접근이 기능하다.
	class InClass{
		int inum = 100;
		
		void inTest() {
			System.out.println("OutClass num =" + num + "(외부 클래스의 인스턴스 변수");
			System.out.println("OutClass sNum = "+ sNum + "(외부 클래스의 인스턴스 변수");
			
		}	
	}
	//a메서드
	public void usingClass() {
		inClass.inTest();
	}
	//내부클래스2
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
//			num+= 10;  //외부클래스의 인스턴스 변수는 사용할 수 없음. 
			System.out.println("INstaticClass inNum =" + inNum + "내부 블래스의 인스턴스 변수사용");
			System.out.println("INstaticClass sInNum =" + sInNum + "내부 클래스의 스태틱 변수사용");
			System.out.println("INstaticClass sNum =" + sNum + "외부 클래스의 스태틱 변수사용");
		}
		static void sTest() {
			//외부클래스의 인스턴스 멤버는 사용 불가능
//			num+=10 ; (사용불가)
			//내부클래스의 인서턴스 멤버는 사용 불가능
//			inNum += 10;
			System.out.println("OutClass sNum =" + sNum + "외부 클래스의 스태틱 변수사용");
			System.out.println("InStaticClass sInNum =" + sNum + "내부 클래스의 스태틱 변수사용");
		}	
	}
}

public class InnerTest {

	public static void main(String[] args) {
			
		//인스턴스(객체와 비슷하게 보자) 내부클래스 객체 생성하는 다양한 방법.
		
		//방법1)외부 클래스 객체 생성하면서 OutClass()생성자가 호출되어, 그 안에서 내부클래스 객체가 생성.
		OutClass outClass = new OutClass();
		System.out.println("외부클래스 이용하여 내부클래스 기능 호출"); //OutClass생성자가 호출되어, 그 안에서 내부클래스 객체가 생성
		outClass.usingClass();
		
		System.out.println();
		
		//방법2)외부클래스를 이용하여 내부클래스 객체 생성
		OutClass.InClass inClass = outClass.new InClass();
		System.out.println("외부 클래스 변수를 이용하여 내부 믈래스 생성");
		inClass.inTest();

		//방법3) 스태틱 내부클래스 사용하는 방법
		//외부 클래스 생성하지 않고 바로 정적내부클래스 생성
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적내부 클래스 일반메서드 호출");
		
		//기본문법 : 클래스명.스태틱멤버 적븐, 객체명.인스턴스 멤버 접근
		sInClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 스태틱 메서드 호출");
		OutClass.InStaticClass.sTest();
		
	}
}

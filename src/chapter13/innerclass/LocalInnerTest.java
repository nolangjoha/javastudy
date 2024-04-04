package chapter13.innerclass;

//지역내부클래스
class Outer {
	
	//클래스 바로 밑의 레벨에 있는 변수를 '전역변수'라 한다.
	int outNum = 100;
	static int sNum = 200;
	
	//메서드(getRunnable메서드) 내부에 클래스를 정의
	Runnable getRunnable(int i) {
		int num = 100;  //메서드 내부에있는 변수를 '지역변수'라 한다.
		
		//스레드
		class MyRunnable implements Runnable{
			
			int localNum = 10;

			@Override
			public void run() {
				System.out.println("i = "+ i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum =" + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum =" + Outer.sNum + "(외부 클래스 정적변수)");
			}
		}
		return new MyRunnable();		
	}
	void methodA() {
		//지역내부 클래스
		class A {}
		//바로 객체생성에 사용해야 한다. 
		A a = new A();
	}
	
	
	
}



public class LocalInnerTest {

	public static void main(String[] args) {

	}

}

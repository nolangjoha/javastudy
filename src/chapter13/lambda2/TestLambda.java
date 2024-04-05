package chapter13.lambda2;

//원본 자파파일에는 인터페이스, 클래스 함께 코드가 작성되어 있지만,
// 컴파일 되면 인터페이스 내용은 PringtString.class파일로 생성된다.
// TestLambda 클래스는 TestLambda.class파일로 생성된다.

//PrintString.class
interface PrintString{
	
	//추상메서드
	void showString(String str);
	
}

//TestLanbds.class
public class TestLambda {

	public static void main(String[] args) {

		//1) 인터페이스명 변수 = 추상메서드를 구현한 람다식 문법;
		PrintString lambdaStr = /*(String str)*/ s  -> System.out.println(s);
	     					  //매개변수가 1개일 때는 괄호 생략가능, 위에 데이터 타입 지울 수 있음. 변수명도 str로 할 필요 없음(s로 바꿔 넣어놓겠음). 
		
		lambdaStr.showString("hello lambda 1"); //()내용이 위에 s로 들어감.
		
		showMyString(lambdaStr);
		
		PrintString reStr = returnString();  //(str) -> { System.out.println(str + "world");};
		reStr.showString("hello");
	}
	
	//2) 함수형인터페이스를 메서드의 매개변수로 사용하기.
	public static void showMyString(PrintString p) {
		p.showString("hello lambda2"); // s-> System.out.println(s); 실행된
	}
	
	//3) 함수형 인터페이스를 메서드 리턴타입으로 사용하기.
	public static PrintString returnString() {
		
		//void showString(String str); 메서드에 대한 람다식 분법을 리턴으로 코드작성
		return (str) -> { System.out.println(str + " world");};
	}
	
}

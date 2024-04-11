package chapter15.stream.other;

import java.util.Scanner;  // Scanner클래스를 패키지명 없이 사용가능하게 해주는 의미.

//벡엔드에서 이 기능을 사용할 일은 없지만 이제 인터넷에서 여러 예제들을 보다보면 아래 예제들을 보게 될 것이다.
//Scanner클래스 사용 : 키보드를 통하여 입력받는 데이터를 더 쉽고, 편하게 만든 특징.
public class ScannerTest {

	public static void main(String[] args) {
		
		//java.util.Scanner : 위에 import가 없으면 이렇게 써야 한다. 
		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scanner.nextLine();  //입력데이터 String
		System.out.println("직업 : ");
		String job = scanner.nextLine();
		System.out.println("사번 : ");
		int number = scanner.nextInt();  // 입력데이터 int
		
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(number);
	}

}

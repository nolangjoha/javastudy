package chapter11.object;

//문자열 비교.
public class StringEquals {
	
	public static void main(String[] args) {
	
		//기본데이터 타입 사용법처럼 사용 가능. int a = 100;
		String name = "홍길동";
		
		//String은 클래스이므로, 참조타입처럼 사용
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// == 비교연산자는 주소값을 비교기능  
		System.out.println(str1 == str2);  //false
		//Object 클래스의 equals() 메서드를 String 클래스가 힙영역의 값비교로 재정의 해서 제공되고 있다.1
		System.out.println(str1.equals(str2)); //true
		
		
		//데이터 비교시
		/*
	 	  - 기본데이터 타입은 ==비교
	 	  - 문자역데이터 타입(String)은 equals()메서드 사용
	    */
		
		int a  = 100;
		int b = 100;
		if (a==b) {
			System.out.println("a와b는 데이터가 동일하다.");
		}else {
			System.out.println("a와 b는 데이터가 동일하지 않다.");
		}
		
		
		
		
		String name1 = "홍길동";
		String name2 = "홍길동";  // String 데이터 타입은 힙영역에 저장 될때 name1에 "홍길동"이 있는지 먼저 한번보고 있다면 해당 주소를 스택영역에 전달한데 때문에 
		                        // 스택영역의 name1과 name2의 주소값이 같게 저장 된다.
		
		//문자열 비교 할때 아래와 같이 == 사용하면 안됨. 
		//String 클래스이므로 == 주소값 비교가 진행된다.
		if (name1 == name2) {
			System.out.println("name1와 name2는 데이터가 동일하다.");
		}else {
			System.out.println("name1와 name2는 데이터가 동일하지 않다.");
		}
		
		
		//재정의되어, 문자열 데이터 비교 할때는 equals 사용 ★★★★★★
		if(name1.equals(name2)) {
			System.out.println("name1와 name2는 데이터가 동일하다.");	
		}else {
			System.out.println("name1와 name2는 데이터가 동일하지 않다.");
		}
		
		
		
	}
}

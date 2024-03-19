package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		// java 10문법에서 지원.
		// 자료형 추론
		
		var i = 10;        //int i = 10   컴파일됨. (정수형)
		var j = 10.0; 	   // double = 10.0  컴파일됨. (실수형)
		var str = "hello"; // String str = "hello"  컴파일됨. (문자형) 
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		
	}

}

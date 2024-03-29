package chapter11.string;

//  <문자열 데이터를 관리하는 클래스>
// 1) String 클래스   2)StringBuilder 클래스   3) StringBuffer 클래스 

// String 클래스와 StringBuilder 클래스의 데이터 관리의 다른점
public class StringBuilderTest {

	public static void main(String[] args) {

		String str1 = "";
		
		// String 클래스로 문자열 연결 작업을 하면, 힙영역에 결합 될때마다 기억장소가 새로 생기고 그 주소가 스택영역에 대입된다.(기억장소 남발)
		// 힙영역 : 1. 1번째 문자열  / 2. 1번째 문자열 2번째 문자열 / 3. 1번째 문자열 2번째 문자열 3번째 문자열  .......(비효율적)
		
		for(int i = 1; i <= 10; i++) {
			str1 += i + " 번째 문자열\n";
			System.out.println(System.identityHashCode(str1));		//for문 안에서 주소가 계속 바뀐다.	
		}
		
		System.out.println(str1);
		
		System.out.println("=========");
		
		StringBuilder sb = new StringBuilder("시작");
		
		// StringBuilder 은 처음 "시작"(최초의 기억장소)이 들어간 기억장소 안에 데이터가 추가된다. (효율적, 성능이 더 빠름.)
		// 처음생성된 힙영역의 기억장소를 이용하여, 문자열 데이터가 관리된다.
		for(int i = 1; i <= 10; i++) {
			sb.append(i + " 번째 문자열\n");
			System.out.println(System.identityHashCode(sb));	   // for문 안에서 주소가 동일하다.
		}
		
		System.out.println(sb);
		
		
	}

}

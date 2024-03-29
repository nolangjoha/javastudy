package chapter11.string;

// 문자열 데이터끼리 결합(연결)을 하면, 새로운 기억장소로 관리가 된다.
public class StringTest2 {
	
	public static void main(String[] args) {
	
	String javaStr = new String("java");
	String androidStr = new String("android");
	System.out.println(javaStr);
	System.out.println("처음 문자열 주소값: " + System.identityHashCode(javaStr));
		
	//concat : 새로운 기억장소가 만들어지고(해당 기억장소의 데이터는 javaStr과 androisStr을 합친 문자)그 기억장소의 주소가 javaStr로 대입된다.
	//"javaandroid" 새로운 문자열로 기억장소 새로 생성된다.
	javaStr = javaStr.concat(androidStr);
	
	System.out.println(javaStr); //javaandroid
	System.out.println("연결된 문자열 주소값: " + System.identityHashCode(javaStr));
	
	// javaStr. ctrl + 스페이스 해보면 나오는 명령어 : w3c의 자바스크립트 string()메서드 부분의 명령어와 거의 동일하다
	// 자바스크립트 개발자가 자바를 참고하여 개발하였기 때문에
	
	
	}
}

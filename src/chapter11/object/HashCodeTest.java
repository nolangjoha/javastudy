package chapter11.object;

// 객체의 해시코드(HashCode)값 확인하기.
// 해시코드란 힙영역의 생성된 주소를 참조하는 값이다.
public class HashCodeTest {
	
	public static void main(String[] args) {
	
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//객체의 해시코드 값 확인하기.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}
}

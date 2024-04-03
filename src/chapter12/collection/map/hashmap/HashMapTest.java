package chapter12.collection.map.hashmap;

import java.util.HashMap;

//Map 인터페이스를 구현한 HashMap클래스 예제
// key 와 value 쌍으로 된 구조를 갖고있다. 이 구조를 Entry 라고 부른다.
//컬렉션은 아래와 같이 단순 데이터(이건 예제니까 간단하게)가 아니라 '객체'를 저장하기 위해 사용한다.
public class HashMapTest {


	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("가", 1);
		map.put("나", 2);
		map.put("다", 3);
		map.put("라", 4);
		map.put("마", 5);
		// 앞쪽 데이터(key 값)는 중복 안됨, 뒤쪽 데이터(value 값)는 중복 가능.
		
		System.out.println(map.get("가")); //1
		
		
	}
}

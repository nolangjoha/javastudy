package chapter12.collection.treeset;

import java.util.TreeSet;

//set 인터페이스를 구현한 TreeSet 클래스 예제
//자료구조 특징? TreeSet은 이진 탐색 트리라는 자료 구조 형태로 데이터를 저장하는 컬렉션 클래스이다. 
//이진 탐색 트리는 정렬, 검색, 범위 검색(range search)에 높은 성능을 보이는 자료 구조
// HashSet 클래스와 다른점.
public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String>treeSet = new TreeSet<String>();
	
		//아래 데이터 추가시 재소비교하여 이진분률 좌, 우측으로 정렬 배치하면서 데이터를 저장한다. 
		treeSet.add("홍길동");  //기준
		treeSet.add("강감찬");  // 홍길동을 기준으로 유니코드값으로 비교, 강감찬은 홍길동의 왼쪽에 배치된다. 
		treeSet.add("이순신");
		
		// 데이터가 정렬된 상태로 출력 된 것을 확인 할 수 있다. 
		// 유니코드 순서상 강감찬 이순신 홍길동 순으로 출력
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
		
		treeSet2.add(4);
		treeSet2.add(1);
		treeSet2.add(7);
		
		for(Integer num : treeSet2) {
			System.out.println(num);
		}
		
	}

}

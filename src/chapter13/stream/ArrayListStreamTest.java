package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//스트림 예제 : 컬렉션에 스트림 기능 사용
public class ArrayListStreamTest {

	public static void main(String[] args) {

	//List컬렉션
	List<String> sList = new ArrayList<String>();
	sList.add("손흥민");
	sList.add("김민재");
	sList.add("이강인");
		
	// 1) 일반 for문. ArrayList클래스는 컬렉션 형태의 기억장소를 0,1, 인덱스형태로 관리.
	for(int i=0; i<sList.size(); i++) {
		System.out.println(sList.get(i));
		}
	System.out.println();
	
	// 2) 향상된for문
	//for(변수선언 : 배열 또는 컬렉션) {}
	for(String s : sList) {
		System.out.println(s);
	}
	System.out.println();
	
	// 3-1) 스트림 : 컬렉션 객체의 데이터를 순차적으로 출력
	//forEach(Consumer함수형인터페이스)
	//매개변수를 사용만하고 리턴하지 않는 함수형
	Stream<String> stream = sList.stream(); // 컬렉션 객체.st
//	stream.forEach(람다식문법);
	stream.forEach(s -> System.out.println(s + " "));
	
	System.out.println();
	
	// 3-2) 스트림 : 컬렉션 객체의 데이터를 정렬. sorted() 메서드 지원되지 않으면, for문 안에서 데이터를 대소비교하여, 정렬코드작업을 해야만 한다. 
	sList.stream().sorted().forEach(s -> System.out.println(s+""));
	//sorted로 인해 정렬된 결과가 출력된다.
	
	
	}

}

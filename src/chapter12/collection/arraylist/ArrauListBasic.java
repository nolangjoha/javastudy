package chapter12.collection.arraylist;

import java.util.ArrayList;

// 컬렉션
// List 인터페이스
// 특징: 데이터 순서유지 및 데이터 중복 허용
 
public class ArrauListBasic {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("손흥민");  //0
		al.add("김민재");  //1
		al.add("이강인");  //2
		al.add("황희찬");  //3
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);  //0  
		al2.add(20);  //1
		al2.add(30);  //2
		al2.add(40);  //3
		al2.add(50);  //4
		
		
		//데이터 출력, get으로 내부 데이터를 읽어온다.
		System.out.println(al.get(2));  //이강인
		System.out.println(al2.get(3)); //40
	}

}

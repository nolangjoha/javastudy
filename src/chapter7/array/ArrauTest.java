package chapter7.array;

public class ArrauTest {

	public static void main(String[] args) {
		//배열 : 동일한 데이터타입으로 연속된 기억장소를 하나의 대표이름관리하는 기능
		/*
		 - 기본데이터 타입으로 생성하는 배열
		 기본데이터타입[] 배열이름 = new 기본데이터타입[] {값1, 값2, 값3, 값4, 값5, 값6};	  
		 */
		
		//int형 배열을 생성하면, 초기값 사용.
		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10}; 
		//10이후 ,는 넣어도 되고 안넣어도 된다. 상관 없음
		// 스택영역에 이름이 number라는 공간이 생성된다. 
		// 기본태그데 대괄호를 함께 쓰는 순간 스택영역과 힙영역이 같이 사용된다.
		
		for(int i=0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		//인덱스가 5인 배열요소를 60으로 변경하라.
		number[5] = 60;
		
		for(int i=0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
		
	}

}

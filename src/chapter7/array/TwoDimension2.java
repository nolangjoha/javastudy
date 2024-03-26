package chapter7.array;

public class TwoDimension2 {

	public static void main(String[] args) {

		// 배열도 객체다.
		// 배열변수에 주소값이 저장되어 있다.
		// 배열도 참조타입이다.
		// 마지막 요소를 가리키는 이름은 행수 -1, 열수 -1 
		
		int [][] arr = {
				{1, 4},
				{2, 5},
				{3, 6}
				};
		
		//배열의 행 크기를 구하라.
		System.out.println("배열의 행크기? " + arr.length);	
		//첫번재 행의 열의 크기를 구하라
		System.out.println("첫번재 행의 열의 크기? " + arr[0].length);
		//두번째 행의 열의 크기를 구하라.
		System.out.println("두번째 행의 열의 크기? " + arr[1].length);
		//세번재 행의 열의 크기를 구하라.
		System.out.println("세번째 행의 열의 크기? " + arr[2].length);
		
		//2행의 2열 데이터를 7로 변경하라.
		arr[1][1] = 7;
		System.out.println("2행의 2열 데이터는? " + arr[1][1]);
		//3행의 2열 데이터를 8로 변경하라.
		arr[2][1] = 8;
		System.out.println("3행의 1열 데이터는? " + arr[2][1]);
		
		//중첩 for문을 사용하여 2차원 배열을 출력하자.
		for(int i=0; i< arr.length; i++) {  //행 인덱스
			for(int j=0; j<arr[i].length; j++) {  //열 인덱스
				System.out.print(arr[i][j] + "\t");   //println이 아니라 print로
			}System.out.println();
		}
		
	}

}

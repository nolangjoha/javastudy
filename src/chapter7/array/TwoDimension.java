package chapter7.array;

public class TwoDimension {

	public static void main(String[] args) {

		//2*3: 2행3열의 구조 만들기
		int [][] arr = {
				{1,2,3},
				{4,5,6} 
				}; //원래 1줄 코드이나 직관적인 모양확인을 위해 위와 같이 작성
		
		//두번째 행, 두번째 열의 데이터 출력하기
		System.out.println("두번째 행, 두번째열? " + arr[1][1]);

		//첫번재 행, 세번째 열3을 30으로 변경하라.
		arr [0][2] = 30;
		System.out.println("첫번째 행, 세번째열? " + arr[0][2]);
		
		//행의크기
		System.out.println("arr배열의 행크기 "+ arr.length); //2 (arr의 행의 갯수)
		System.out.println("첫번재 행의 열의 개수? " + arr[0].length); //3  (0번행의 열의 갯수)

		//중첩 for문을 사용하여 2차원 배열을 출력하자.
		for(int i=0; i< arr.length; i++) {  //행 인덱스
			for(int j=0; j<arr[i].length; j++) {  //열 인덱스
				System.out.print(arr[i][j] + "\t");   //println이 아니라 print로
			}System.out.println();
		}
		
		
	}

}

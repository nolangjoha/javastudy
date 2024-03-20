package chapter4.loopexample;

//중첩 for문을 이용한 구구단 예제
public class GuGuDan {

	public static void main(String[] args) {
		
		for(int i=0; i <=9; i++) {
			for (int j=2; j<=9; j++) {
				if(i==0) {
				System.out.print(j+ "단" + "\t");
				continue;
				}		
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			System.out.println();
			//ptintln, ptint 차이
			// print : 줄바꿈 없음
			// println: 줄바꿈 있음
		}
		
	}
}

package chapter4.loopexample;

//print(), println()의 차이점.
public class PrintExample {

	public static void main(String[] args) {

		//print()줄바꿈 기능 없음. 한줄에 출력
		for(int i=1; i <=5; i++) {
			System.out.print(i + "\t");
	}
		System.out.println();
		System.out.println("=========================");
		
		//ptintln() 줄바꿈 기능 있다. 줄이 변경되면서 출력
		for(int i=1; i <=5; i++) {
			System.out.println(i + "\t");
	}
 }
}

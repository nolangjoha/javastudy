package chapter15.stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [enter]를 누르세요");
		
		
		int i;
		
		try {
			//i = System.in.read()이 제일 먼저 동작.
			// i != '\n'
			//키보드를 이용하여 임의의 키를 누르고, 마지막에 Enter키를 누르면 10진수 13으로 처리되고, 문자로 표현시 \n으로 나타난다 			
			while((i = System.in.read()) != '\n') { //Enter키를 누르지 않았을 동안에는
			System.out.println((char)i);          // 화면에 (char)i 를 출력해라
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}

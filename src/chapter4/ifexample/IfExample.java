package chapter4.ifexample;

public class IfExample {

	public static void main(String[] args) {

		boolean isMarried = true;
		
		//if(true or false로 해석되는 코드) 이렇게 구성되어야 한다. // 자바스크립트는 저렇게 안넣어도 에러는 안나더라...ㅇㅅㅇ..
		if(isMarried) {
			System.out.println("기혼입니다.");
			
		}
		
		boolean isEven;
		// true나 flase 구문은 변수 이름을 의례적으로'is~적합명사~'라고 짓는다.		
		int num = 10;
		
		
		isEven = (num % 2 == 0) ? true : false;
		// 해석 : (num % 2 == 0)가 true면 대입되고, 아니면 false가 대입된다. 
		System.out.println(isEven);
	
	}

}

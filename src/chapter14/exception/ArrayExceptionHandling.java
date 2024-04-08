package chapter14.exception;

/*
 예외(Exception) : 프로그램이 실행도중 강제적인 종료가 발생하는 상황
 예외처리 : 강제적인 종료를 막고, 프로그램이 나머지 코드를 정상적으로 실행하여, 종료가 되게 하는 기능.
 예외 처리를 위한 클래스를 JDK에서 제공하고 있다.
 
 */

public class ArrayExceptionHandling {

	public static void main(String[] args) {

		int[] arr = new int[5];//int 형 기억장소 5개를 연속적으로 생성하는 배열. arr[0]~arr[4]
		
		
//		arr[5] = 10; // 6번째 기억장소를 가리킴. 실제 6번째 기억장소는 존재하지 않는다(arr[4]까지)
//오류가 발생하면 오류가 발생한 부분에서 실행이 중단된다.
	
		//예외 처리 문법
		try {
			//예외가 발생할 수 있는 코드
		for(int i=0; i<=5; i++) {		    //<=  :  '='연산자를 넣으면 오류 발생 
			System.out.println(arr[i]);   
			}
		}catch(Exception ex){
			//예외가 발생되면 동작
			System.out.println(ex);		//어떤 오류가 발생하는지 문법적으로 출력해 보여주는 것(이건 강제종료x)
			System.out.println("예외발생");   //이 코드가 실행되면 try 문 안에서 오류가 발생한 것이다.
		}
		System.out.println("프로그램 종료");
	}		
}


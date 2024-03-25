package chapter7.array;

public class BookArray1 {

	public static void main(String[] args) {

		
		//스택영역(주소) -> 힙영역(데이터)
		//메모리 구조 표현
		Book b1 = new Book();            // 스택영역(3개) 힙영역(3개) 값갯수별로 하나씩 기억장소 생성
		Book b2 = new Book();
		Book b3 = new Book();
		  // 값이 3개면 이름도 3개, 아래는 큰 이름1개만 생성됨. 아래가 효율적. 배율을 사용하면 for문도 사용할 수 있으며 사용에 용이함.
		
		
		//위에것과 같은 말이다. 
		//클래스배열(객체배열)
		//스택영역(주소) ->힙영역(주소) ->힙영역(데이터)
		//메모리구조 표현
		Book[] bookArray = new Book[3];  //1) 스택의 데이터 null로 기억장소 1개 생성, 2) 힙영역에 3개의 기억장소 생성(주소도 발생) 데이터는 모두 null, 
		bookArray[0] = new Book();       //3) 해당코드들이 실행되면 힙의 새로운 기억장소(주소도 발생)에 데이터가 들어가는데 그 값이 2)에서 생성된 기억장소에 들어가게 되며 한번더 참조가 발생함. 
		bookArray[1] = new Book();	//실제 데이터가 관리되는 힙영역의 기억장소 생성작업
		bookArray[2] = new Book();
		
		
		
	}

}

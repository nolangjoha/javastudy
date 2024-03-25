package chapter7.otherarray;

import chapter7.array.Book;

public class BookTest {

	public static void main(String[] args) {

		//생성자의 접근자 이해 때문에 작성.
		//default 는 동일패키지 접근, 다른패키지 접근불가(다른패키지에서 접속하면 private성향을 보인다).
		// public 은 패키지 상관없이 모두 접근 가능.
		Book b1 = new Book();
	}

}
